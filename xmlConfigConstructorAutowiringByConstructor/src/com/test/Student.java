package com.test;


public class Student 
{
   private String stdName;
   private int stdRollno;
   private int stdMarks;
   
   private Address address;
   
   
   
public Student(String stdName, int stdRollno, int stdMarks, Address address) {
	super();
	this.stdName = stdName;
	this.stdRollno = stdRollno;
	this.stdMarks = stdMarks;
	this.address = address;
}






@Override
public String toString() {
	return "Student [stdName=" + stdName + ", stdRollno=" + stdRollno + ", stdmarks=" + stdMarks + ", address="
			+ address + "]";
}


}
