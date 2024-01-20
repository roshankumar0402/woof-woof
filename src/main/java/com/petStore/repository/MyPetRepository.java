package com.petStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petStore.entity.MyPetList;

@Repository
public interface MyPetRepository extends JpaRepository<MyPetList,Integer>{

}
