package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestContainer 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfig.class);
		
		Department department = (Department) context.getBean("department1");
		
		department.setDepartmentId(432);
	    department.setDepartmentName("Testing");
		
		Employee employee1 =(Employee) context.getBean("employee1");
			
		employee1.setEmployeeId(432);
		employee1.setEmployeeName("Geeta Shahane");
		employee1.setEmployeeRole("Automation Test Engineer");
		employee1.setEmployeeSalary(745621.98);
		employee1.setDepartment(department);

			
		System.out.println(employee1.toString());
		
		
	}

}
