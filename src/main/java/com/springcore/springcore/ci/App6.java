package com.springcore.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App6 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/ci/CiConfig.xml");
		ConInjection a6= (ConInjection) context.getBean("a");
		System.out.println(a6);
		

	}

}
