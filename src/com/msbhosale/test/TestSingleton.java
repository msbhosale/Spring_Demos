package com.msbhosale.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.msbhosale.beans.Student;

public class TestSingleton {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Student studentA = (Student) context.getBean("student2");
		
		studentA.setRollNumber(2812);
		
		System.out.println(studentA);
		
		Student studentB = (Student) context.getBean("student2");
		
		System.out.println(studentB);
	}
}