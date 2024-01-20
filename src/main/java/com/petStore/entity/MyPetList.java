package com.petStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MyPets")
public class MyPetList {
	@Id
	private int id;
	private String name;
	private String owner;
	private String price;
	public MyPetList(int id, String name, String owner, String price) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.price = price;
	}
	public MyPetList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
