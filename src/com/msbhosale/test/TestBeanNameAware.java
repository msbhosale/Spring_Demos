package com.msbhosale.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.msbhosale.beans.Date;

public class TestBeanNameAware {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Date date = (Date) context.getBean("date");
		
		System.out.println(date);
	}
}