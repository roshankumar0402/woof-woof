package com.petStore.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String owner;
	private String price;
	public Pet(int id, String name, String owner, String price) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.price = price;
	}
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
		}
	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	public String getName() {
		return name;}
	public void setName(String name) {
		this.name = name;}
	public String getOwner() {
		return owner;}
	public void setOwner(String owner) {
		this.owner = owner;}
	public String getPrice() {
		return price;}
	public void setPrice(String price) {
		this.price = price;}
}
