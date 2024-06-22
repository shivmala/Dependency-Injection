package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestContainer 
{
   public static void main(String[] args)
   {
	 
	   ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfig.class);
	   
	   Student std1 = (Student) context.getBean("student1");
	  
	   System.out.println(std1.toString());
	   
   }
}
