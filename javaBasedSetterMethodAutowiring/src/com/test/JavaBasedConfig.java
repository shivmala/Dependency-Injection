package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedConfig 
{
   @Bean(name="student1")	
   public Student getStudentObj()
   {
	   return new Student();
   }
   
   
   
      @Bean(name="address1")	
      public Address getAddrObj1()
      {
   	   return new Address();
      }
      
      @Bean(name="address2")	
      public Address getAddrObj2()
      {
   	   return new Address();
      }
}
