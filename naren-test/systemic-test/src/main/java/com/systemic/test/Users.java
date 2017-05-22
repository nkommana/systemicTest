package com.systemic.test;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {	
	
	@Id
	private String id;
	private String firstname;
	private String lastname;
	private String dob;
	private String age;
	private String salary;
	
	
	public Users() {}	
	
	public Users(String id, String firstname, String lastname, String dob, String age, String salary) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.age = age;
		this.salary = salary;
	}	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
		
		
	
}
