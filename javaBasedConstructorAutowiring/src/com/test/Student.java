package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student 
{
   private String stdName;
   private int stdRollno;
   private int stdmarks;
   
   @Autowired
   @Qualifier("address2")
   private Address address;

   
   public Student(String stdName, int stdRollno, int stdmarks, Address address) {
	super();
	this.stdName = stdName;
	this.stdRollno = stdRollno;
	this.stdmarks = stdmarks;
	this.address = address;
   }


   @Override
   public String toString() {
	return "Student [stdName=" + stdName + ", stdRollno=" + stdRollno + ", stdmarks=" + stdmarks + ", address="
			+ address + "]";
}


}
