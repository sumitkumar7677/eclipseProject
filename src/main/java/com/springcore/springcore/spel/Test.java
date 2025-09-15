package com.springcore.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/spel/spelConfig.xml");
		Spel spel = context.getBean("spel",Spel.class);
		System.out.println(spel);
		
	}

}
