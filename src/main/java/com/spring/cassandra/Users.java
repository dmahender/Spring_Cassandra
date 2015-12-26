package com.spring.cassandra;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Users {
	
	@PrimaryKey
	private String id;
	 
	private String lastname;
	
	private int age;
	
	private String city;
	
	private String email;
	
	private String firstname;

	

	public Users(String id, String lastname, int age, String city,
			String email, String firstname) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.age = age;
		this.city = city;
		this.email = email;
		this.firstname = firstname;
	}

	public String getId() {
		return id;
	}

	public String getLastname() {
		return lastname;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String toString() {
		return "User [id="+id+", firstname="+firstname+",age= "+age;
		
	}
	
	

}
