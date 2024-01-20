package com.petStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petStore.entity.MyPetList;
import com.petStore.repository.MyPetRepository;

@Service
public class MyPetListService {
	@Autowired
	private MyPetRepository mypet;
	public void saveMyPets(MyPetList pet) {
		mypet.save(pet);
	}
	
	public List<MyPetList> getAllMyPets(){
		return mypet.findAll();
	}
	
	public void deleteById(int id) {
		mypet.deleteById(id);
	}
}
