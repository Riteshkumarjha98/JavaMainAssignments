package com.Day4Nit;

public class Student {
int roll;
String name;
String address;
String collageName;



public Student(int roll, String name, String address) { //Three Argument
	super();
	this.roll = roll;
	this.name = name;
	this.address = address;
	this.collageName = "NIT";
	
}

public Student(int roll, String name, String address, String collegeName) { //Four Argument
	super();
	this.roll = roll;
	this.name = name;
	this.address = address;
	this.collageName = collegeName;
}
   public static Student getStudent(boolean isFromNIT) {
	if(isFromNIT == true) {
		Student S1 = new Student(218,"RItesh","Patna");
		return S1;
	}
	else {
		Student S1 = new Student(218,"Ritesh","Delhi","IIT");
		return S1;
	}
}
	public static void main(String[]args) {
		Student Rit = getStudent(false);
		System.out.println(Rit.collageName);
		
		Student Anny = getStudent(true);
		System.out.println(Anny.collageName);
	}

}
