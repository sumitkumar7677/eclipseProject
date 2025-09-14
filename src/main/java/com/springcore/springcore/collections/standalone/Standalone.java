package com.springcore.springcore.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Standalone {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/springcore/collections/standalone/alone.xml");
		Alone alone = con.getBean("Stand",Alone.class);
		System.out.println(alone);
		System.out.println(alone.getName().getClass());
		System.out.println(alone.getSection().getClass());
		
	
	}

}
