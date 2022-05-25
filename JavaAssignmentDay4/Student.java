package com.JavaAssignmentDay4;

public class Student {
 private int roll;
 private String name ;
 private int age;
 private int marks;

 
 
 //Zero Argument constructor
 public Student() {
	 
	 
 }
 
 public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

//Paramaterized constructor
 public Student(int r ,String n, int m,int a) { 
//	 if(a>18 && a<60 && m >0 && m<500)
//		{a
	 this.roll=r;
	 this.name=n;
	 this.marks=m;
	 this.age=a;
 }
 
	
// }
 public void printDetail() {
	 if (getAge()>18 && getAge()<60 && getMarks() > 0 && getMarks()<500) {
		 
		 System.out.println("Roll is " + roll);
		 System.out.println("name is " + name);
		 System.out.println("marks is " + marks);
		 System.out.println("age is " + age);
	  
	 }
	 else {System.out.println("Please enter valid arguments");
	 
	 }
}

 public static void main(String[] args) {
	 Student S1 = new Student();
	 S1.printDetail();
	 
	 Student S2 = new Student(1,"Ritesh",400,20);
	 S2.printDetail();
	 
 }
}