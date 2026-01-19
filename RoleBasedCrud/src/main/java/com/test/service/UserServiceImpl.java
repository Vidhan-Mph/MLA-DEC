package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.test.dto.UserDto;
import com.test.entity.Role;
import com.test.entity.User;
import com.test.repository.RoleRepository;
import com.test.repository.UserRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void saveUser(UserDto userDto) {

        if (userRepository.existsByUsername(userDto.getUsername())) {
            throw new RuntimeException("Username already exists");
        }

        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setEnabled(userDto.isEnabled());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));

        Set<Role> roles = new HashSet<>();
        for (Long roleId : userDto.getRoleIds()) {
            Role role = roleRepository.findById(roleId)
                    .orElseThrow(() -> new RuntimeException("Role not found"));
            roles.add(role);
        }

        user.setRoles(roles);
        userRepository.save(user);
    }

    @Override
    public void updateUser(UserDto userDto) {

        User user = userRepository.findById(userDto.getId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setUsername(userDto.getUsername());
        user.setEnabled(userDto.isEnabled());

        // Update password only if provided
        if (userDto.getPassword() != null && !userDto.getPassword().isEmpty()) {
            user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        }

        Set<Role> roles = new HashSet<>();
        for (Long roleId : userDto.getRoleIds()) {
            Role role = roleRepository.findById(roleId)
                    .orElseThrow(() -> new RuntimeException("Role not found"));
            roles.add(role);
        }

        user.setRoles(roles);
        userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
