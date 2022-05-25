package com.Practice;

public class New {
	public static void main(String[] args) {
		int[]marks=new int[4]; // by default it will be given zero
		
		
		int[] marks1 = {1,2,3,4};
		System.out.println(marks1[0]);
		
		marks[0]=4;
		marks[1]=9;
		marks[2]=7;
		marks[3]=9;
		System.out.println(marks[0]);
		for (int items:marks) {
//			System.out.println(items);
		}
		
	}

}
