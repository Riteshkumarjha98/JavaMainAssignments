package com.swi;



class StudentData {
	int roll;
	String name;
	int marks;
	void StudentDetail(){
		System.out.println("Roll is :"+ roll);
		System.out.println("Name is :" + name);
		System.out.println("Marks is :" + marks);
	
		
	}
	public static void main (String[] args) {
		StudentData  student1 = new StudentData();
		StudentData  student2 = new StudentData();
		student1.roll = 10;
		student1.name = "Krrish";
		student1.marks = 500;
		student1.StudentDetail();
		student1 = null;
		
		System.out.println(student1);
		
		student2.roll = 20;
		student2.name = "Kristina";
		student2.marks = 450;
		student2.StudentDetail();
		student2 = null;
		
		System.out.println(student2);
		
		
		
	}
}

