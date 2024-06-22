package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student 
{
   private String stdName;
   private int stdRollno;
   private int stdMarks;
   
   private Address address;

   
   public void setStdName(String stdName) {
	this.stdName = stdName;
   }
   
   public void setStdRollno(int stdRollno) {
	this.stdRollno = stdRollno;
   }

   public void setStdMarks(int stdMarks) {
	this.stdMarks = stdMarks;
   }
   
   

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Student [stdName=" + stdName + ", stdRollno=" + stdRollno + ", stdmarks=" + stdMarks + ", address="
			+ address + "]";
}


}
