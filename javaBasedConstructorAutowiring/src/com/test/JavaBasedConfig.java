package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedConfig 
{
   @Bean(name="student1")	
   public Student getStudentObj()
   {
	   return new Student("Vimal", 12, 98, getAddrObj1());
   }
   
   
   
      @Bean(name="address1")	
      public Address getAddrObj1()
      {
   	   return new Address(123, "Mumbai", 2345167);
      }
      
      @Bean(name="address2")	
      public Address getAddrObj2()
      {
   	   return new Address(67, "Ranchi", 897612);
      }
}
