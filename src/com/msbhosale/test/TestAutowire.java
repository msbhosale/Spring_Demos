package com.msbhosale.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.msbhosale.beans.Person;

public class TestAutowire {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Person person = (Person) context.getBean("person");
		
		System.out.println(person);
	}
}