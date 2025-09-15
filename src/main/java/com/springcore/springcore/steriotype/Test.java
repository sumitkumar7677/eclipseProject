package com.springcore.springcore.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/steriotype/sterioConfig.xml");
		Student student =context.getBean("student",Student.class);
		System.out.println(student);
		
		System.out.println(student.getCity());
		System.out.println(student.getStudentName().getClass());
		Student student2 = context.getBean("student",Student.class);
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
	}
	
	

}
