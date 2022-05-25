package com.JavaAssignmentDay4;

public class Demo {
	
public Demo() {

	this("String");
	System.out.println("Inside Zero argument");  
	}

   public Demo(String s) {
	   this(5);
	   System.out.println("Inside String argument");
	   
   }
   public Demo(int i) {
	   this(5.5f);
	   System.out.println("Inside int  argument ");
	   
   }
   public Demo(float f) {
	   
	   System.out.println("Inside float argument");
   }
   public static void main (String[] args) {
//	   Demo d1= new Demo();
	   new Demo();

}


}