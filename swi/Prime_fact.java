package com.swi;

import java.util.Scanner;

public class Prime_fact {
	public static void main (String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a number: ");
   int x = input.nextInt();
   input.close();
   for(int i=2;i<=x;i++) {
	   while(x%i==0) {
		   System.out.print(i + " ");
		   x/=i;
	   }
   }
   
		
}
	
	
}