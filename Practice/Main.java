package com.Practice;

import java.util.Arrays;

public class Main {
	public int[] findAndReturnPrimeNumbers(int[] inputArray) {
		int[] ansArr = new int[0];
		for(int i: inputArray) {
			int count = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 0) {
				ansArr = Arrays.copyOf(ansArr, ansArr.length + 1);
				ansArr[ansArr.length - 1] = i;
			}
		}
		return ansArr;
	}
	public static void main(String[] args) {
		Main obj = new Main();
		int[] arr = {10,12,5,50,11,14,15};
		int[] result = obj.findAndReturnPrimeNumbers(arr);
		if(result.length == 0) {
			System.out.println("Prime number not found in the supplied Array");
		}
		else {
			for(int i: result) {
				System.out.println(i);
			}
		}
	}
}