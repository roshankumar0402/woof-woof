package com.petStore.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.petStore.entity.Pet;
import com.petStore.service.MyPetListService;
import com.petStore.service.PetService;
import com.petStore.entity.*;
@Controller
public class PetController {

	@Autowired
	private PetService service;
	
	@Autowired
	private MyPetListService myPetService;
	@GetMapping("/")
	public String home() {
		return "/home";
	}
	@GetMapping("/pet_register")
	public String petRegister() {
		return "/petRegister";
	}
	
	@GetMapping("/available_pets")
	public ModelAndView getAllPet() {
		List<Pet>list=service.getAllPet();
	//	ModelAndView m= new ModelAndView();
	//	m.setViewName("petList");
	//	m.addObject("book",list);
		return new ModelAndView("petList","pet",list);
	}
	
	@PostMapping("/save")
	public String addPet(@ModelAttribute Pet p) {
		service.save(p);
		return "redirect:/available_pets";
	}
	
	@GetMapping("/my_pets")
	public String getMyPets(Model model) {
		List <MyPetList>list=myPetService.getAllMyPets();
		model.addAttribute("pet",list);
		return "myPets";
	}
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Pet p=service.getPetById(id);
		MyPetList mp=new MyPetList(p.getId(),p.getName(),p.getOwner(),p.getPrice());
		myPetService.saveMyPets(mp);
		return "redirect:/my_pets";
	}
	
	@RequestMapping("/editPet/{id}")
	public String editPet(@PathVariable("id")int id,Model model) {
		Pet p=service.getPetById(id);
		model.addAttribute("pet",p);
		return "petEdit";
	}
	@RequestMapping("/deletePet/{id}")
	public String deletePet(@PathVariable("id")int id) {
		service.deleteById(id);
		return "redirect:/available_pets";
	
	}
}

