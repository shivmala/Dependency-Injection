package com.Test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedConfig 
{
	
	
	  @Bean(name="department1") 
	  public Department getDepartment1() 
	  {
		  return new Department();
	  }
	 
	
	@Bean(name="employee1")
	public Employee getEmlpoyee1()
	{
        
		
		return new Employee();
		
		
	}
	
    
}
