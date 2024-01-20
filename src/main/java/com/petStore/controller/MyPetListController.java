package com.petStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petStore.service.MyPetListService;

@Controller
public class MyPetListController {
	
	@Autowired
	private MyPetListService service;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id")int id) {
		service.deleteById(id);
		return "redirect:/my_pets";
	}
}
