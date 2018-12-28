package com.msbhosale.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.msbhosale.beans.Student;

public class TestSetterInjection {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Student student = (Student) context.getBean("student");

		System.out.println(student);
	}
}