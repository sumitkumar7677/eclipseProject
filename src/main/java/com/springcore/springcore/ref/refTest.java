package com.springcore.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class refTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/ref/refConfig.xml");
		App4 app4 = (App4) context.getBean("App4ref");
		System.out.println(app4.getA());
		System.out.println(app4.getB().getC());
	}

}
