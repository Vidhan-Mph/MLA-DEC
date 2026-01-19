package com.test.controller;

import com.test.entity.Role;
import com.test.entity.User;
import com.test.repository.RoleRepository;
import com.test.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public AdminController(UserRepository userRepository,
                           RoleRepository roleRepository,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // Admin home
    @GetMapping
    public String adminHome() {
        return "admin/admin-home";
    }

    // List users
    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "admin/user-list";
    }

    // Add user form
    @GetMapping("/users/add")
    public String addUserForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("roles", roleRepository.findAll());
        return "admin/user-form";
    }

    // Save user (create or update)
    @PostMapping("/users/save")
    public String saveUser(
            @Valid @ModelAttribute("user") User user,
            BindingResult result,
            @RequestParam("roleIds") List<Long> roleIds,
            Model model
    ) {
        if (result.hasErrors()) {
            model.addAttribute("roles", roleRepository.findAll());
            return "admin/user-form";
        }

        // Resolve roles safely
        Set<Role> roles = new HashSet<>(roleRepository.findAllById(roleIds));
        user.setRoles(roles);

        // Encode password ONLY if provided
        if (user.getId() == null || (user.getPassword() != null && !user.getPassword().isBlank())) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
        } else {
            // keep existing password
            user.setPassword(
                    userRepository.findById(user.getId())
                            .orElseThrow()
                            .getPassword()
            );
        }

        userRepository.save(user);
        return "redirect:/admin/users";
    }

    // Edit user
    @GetMapping("/users/edit/{id}")
    public String editUser(@PathVariable Long id, Model model) {
        model.addAttribute("user",
                userRepository.findById(id).orElseThrow());
        model.addAttribute("roles", roleRepository.findAll());
        return "admin/user-form";
    }

    // Delete user
    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return "redirect:/admin/users";
    }
}