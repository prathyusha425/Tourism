package com.cognizant.tourism.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.tourism.entity.Tourism;
import com.cognizant.tourism.service.TourismService;

@Controller
@RequestMapping("/tour")
public class TourController 
{
	@Autowired
	TourismService tourismService;

	@GetMapping("/list")
	public String listAllTours(Model model) 
	{
		List<Tourism> listOfTours = tourismService.getAllTours();
		model.addAttribute("tourList", listOfTours);
		System.out.println(listOfTours);
		return "Tour-list";
	}

	@GetMapping("/showFormForAdd")
	public String addTour(Model model) 
	{
		Tourism tour = new Tourism();
		model.addAttribute("tour", tour);
		return "Tour-form";
	}

	@PostMapping("/saveTour")
	public String saveTour(@Valid @ModelAttribute("tour") Tourism tourism, BindingResult bind) 
	{
		System.out.println(bind);
		if (bind.hasErrors())
			return "Tour-form";
		else 
		{
			tourismService.saveTour(tourism);
			return "redirect:/tour/list";
		}
	}

	@GetMapping("/showFormForUpdate")
	public String updateTour(@RequestParam("tourId") int theId, Model model) 
	{
		Tourism tour = tourismService.getTour(theId);
		model.addAttribute("tour", tour);
		return "Tour-form";
	}

	@GetMapping("/deleteTour")
	public String deleteTour(@RequestParam("tourId") int theId) 
	{
		tourismService.deleteTour(theId);
		return "redirect:/tour/list";
	}
}
