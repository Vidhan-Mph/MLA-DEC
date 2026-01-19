package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.test.SpringBootThymleafApplication;
import com.test.entity.Tutorial;
import com.test.repository.TutorialRepository;

@Controller
public class TutorialController {

    private final SpringBootThymleafApplication springBootThymleafApplication;

	@Autowired
	private TutorialRepository repository;

    TutorialController(SpringBootThymleafApplication springBootThymleafApplication) {
        this.springBootThymleafApplication = springBootThymleafApplication;
    }
	
	@GetMapping("/tutorials")
	public String getAllTutorial(Model model, @Param("keyword") String keyword) {
		try {
			List<Tutorial> tutorials = new ArrayList<>();
			
			if(keyword ==null) {
				repository.findAll().forEach(tutorials::add);
			}else {
				repository.findByTitleContainingIgnoreCase(keyword).forEach(tutorials::add);
				model.addAttribute("keyword", keyword);
			}
			model.addAttribute("tutorials", tutorials);
		}catch(Exception e) {
			model.addAttribute("message", e.getMessage());
		}
		
		return "tutorials";
		
	}
	@GetMapping("/tutorials/new")
	public String addTutorial(Model model)
	{
		Tutorial tutorial=new Tutorial();
		
		tutorial.setPublished(true);
		
		model.addAttribute("tutorial", tutorial);
		
		model.addAttribute("pageTitle","create new Tutorial");
		
		return"tutorial_form";
		
		
	}
	
	@PostMapping("/tutorials/save")
	public String saveTutorial(Tutorial tutorial,RedirectAttributes redirectAttributes) {
		try {
			repository.save(tutorial);
			 
			
			if(keyword ==null) {
				repository.findAll().forEach(tutorials::add);
			}else {
				repository.findByTitleContainingIgnoreCase(keyword).forEach(tutorials::add);
				model.addAttribute("keyword", keyword);
			}
			model.addAttribute("tutorials", tutorials);
		}catch(Exception e) {
			model.addAttribute("message", e.getMessage());
		}
		
		return "tutorials";
		
	}
	
	
	public String editTutorial(@PathVariable Integer id, Model model,RedirectAttributes redirect)
	{
		try
		{
			Tutorial tutorial=repository.findById(id).get();
			
			model.addAttribute("tutorial",tutorial);
			model.addAttribute("pageTitle", "Edit Tutorial(ID:"+id+")");
			
			return "tutorial_form";
		}
		catch(Exception e)
		{
			redirect.addFlashAttribute("message",e.getMessage());
			return "redirect:/tutorials";
		}
		
		
	}
	
	@GetMapping("/tutorials{id}/published/{status}")
	public String updateTutorialPublishedStatus(
			@PathVariable Integer id,
			@PathVariable boolean published,
			Model model, RedirectAttributes redirectAttributes) {
		try {
			repository.updatePublishedStatus(id, published);
			
			String status = published? "published": "disabled";
			String message = "The tutorial id = "+id+ "has been" +status;
			redirectAttributes.addFlashAttribute("message", message);
		}
		catch (Exception e) {
			redirectAttributes.addFlashAttribute("message", e.getMessage());
		}
		return "redirect:/tutorials";
	}

	
	
}
