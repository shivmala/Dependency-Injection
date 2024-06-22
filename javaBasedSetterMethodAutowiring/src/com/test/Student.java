package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student 
{
   private String stdName;
   private int stdRollno;
   private int stdmarks;
   
   @Autowired
   @Qualifier("address1")
   private Address address;

   
   public void setStdName(String stdName) {
	this.stdName = stdName;
   }
   
   public void setStdRollno(int stdRollno) {
	this.stdRollno = stdRollno;
   }

   public void setStdmarks(int stdmarks) {
	this.stdmarks = stdmarks;
   }
   
   

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Student [stdName=" + stdName + ", stdRollno=" + stdRollno + ", stdmarks=" + stdmarks + ", address="
			+ address + "]";
}


}
