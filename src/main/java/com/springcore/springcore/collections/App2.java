package com.springcore.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		
		 
         
         ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/collections/collectionConfig.xml");
         Emp emp1 =(Emp) context.getBean("emp1");
         System.out.println(emp1.getEmpId());
         System.out.println(emp1.getEmpName());
         System.out.println(emp1.getEmpAddress());
         System.out.println(emp1.getEmpCoursesMap());
	}

}
