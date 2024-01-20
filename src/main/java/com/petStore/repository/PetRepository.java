package com.petStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petStore.entity.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet,Integer> {

}
