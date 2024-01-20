package com.petStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petStore.entity.Pet;
import com.petStore.repository.PetRepository;

@Service
public class PetService {

	@Autowired
	private PetRepository pRepo;
	public void save(Pet p) {
		pRepo.save(p);
	}
	
	public List<Pet> getAllPet()
	{
		return pRepo.findAll();
	}
	public Pet getPetById(int id) {
		return pRepo.findById(id).get();
	}
	public void deleteById(int id) {
		pRepo.deleteById(id);
	}
}
