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
	private long id;
	
	@Column(name = "user_name")
	private String name;
	
	
	
	private int age;
	
	@Column(name = "address")
	private String City;
	
	private String Gender;
	
	private String emailid;
	
	private int mobileno;
	
	private int Deptid;
	
	private int salary;
	
	private String Organization;
	
	
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(long id, String name, int age, String city, String gender, String emailid, int mobileno, int deptid,
			int salary, String organization) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		City = city;
		Gender = gender;
		this.emailid = emailid;
		this.mobileno = mobileno;
		Deptid = deptid;
		this.salary = salary;
		Organization = organization;
	}







	public long getId() {
		return id;
	}


	public void setId(long id) {
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
	
	


	public String getEmailid() {
		return emailid;
	}




	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}




	public int getMobileno() {
		return mobileno;
	}




	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}




	public int getDeptid() {
		return Deptid;
	}




	public void setDeptid(int deptid) {
		Deptid = deptid;
	}
	

	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getOrganization() {
		return Organization;
	}



	public void setOrganization(String organization) {
		Organization = organization;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", City=" + City + ", Gender=" + Gender
				+ ", emailid=" + emailid + ", mobileno=" + mobileno + ", Deptid=" + Deptid + ", salary=" + salary
				+ ", Organization=" + Organization + "]";
	}





	


}
