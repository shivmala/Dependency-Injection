package com.Test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig 
{
    @Bean(name="department1")
	public Department getDepartment1()
	{
		return new Department(200, "Development");
	}
    
    @Bean(name="employee1") 
	public Employee getEmlpoyee1() 
	{
		return new Employee(432, "Saurabh", "Java Developer", 8732948.56, getDepartment2()); 
		  
	}
    
    @Bean(name="department2")
	public Department getDepartment2()
	{
		return new Department(298, "Testing");
	}
    
    @Bean(name="employee2") 
	public Employee getEmlpoyee2() 
	{
		return new Employee(355, "Vaibhavi", "Automation Test Engineer", 986406.87, getDepartment2()); 
		  
	}
	 
    
}
