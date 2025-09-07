package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Spring Learning " );
         ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         Student student1 = (Student) context.getBean("student1");
         System.out.println(student1);
         ApplicationContext context2 = new ClassPathXmlApplicationContext("config.xml");
         Student student2 = (Student) context.getBean("student2");
         System.out.println(student2);
         ApplicationContext context3 = new ClassPathXmlApplicationContext("config.xml");
         Student student3 =(Student) context.getBean("student3");
         System.out.println(student3);
         
        	 
    }
}
