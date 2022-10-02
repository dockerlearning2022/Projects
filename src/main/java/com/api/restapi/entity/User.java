package com.api.restapi.entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "user_name")
	private String name;
	
	private int age;
	
	@Column(name = "address")
	private String City;
	
	private String Gender;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}





	public User(int id, String name, int age, String city, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		City = city;
		Gender = gender;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", Gender=" + Gender + "]";
	}
	
	
	
	
	

}
