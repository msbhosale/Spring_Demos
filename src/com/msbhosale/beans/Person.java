package com.msbhosale.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	private String name;
	private Date birthDate;

	public Person() {

	}

	public Person(String name, Date birthDate) {

		this.name = name;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	@Autowired
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthDate=" + birthDate + "]";
	}
}