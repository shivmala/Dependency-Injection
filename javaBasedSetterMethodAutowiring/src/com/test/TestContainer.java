package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestContainer 
{
   public static void main(String[] args)
   {
	 
	   ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfig.class);
	   
	   Address addr1 = (Address) context.getBean("address1");
	   addr1.setHouseno(34);
	   addr1.setCity("Nanded");
	   addr1.setPincode(786539);
	   
	   Address addr2 = (Address) context.getBean("address2");
	   addr2.setHouseno(54);
	   addr2.setCity("Pune");
	   addr2.setPincode(431722);
	   
	   Student std1 = (Student) context.getBean("student1");
	   std1.setStdName("Komal");
	   std1.setStdRollno(101);
	   std1.setStdmarks(86);
	  
	   
	   System.out.println(std1.toString());
	   
   }
}
