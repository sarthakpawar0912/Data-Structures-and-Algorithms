package com.LinearSearch;
//find number with even no of digits
public class EvenDigits {

	public static void main(String[] args) {
		int[] nums= {12,345,2,6,7896};
		System.out.println(findBNumbers(nums));
		
		System.out.println(digits(56749));
	}
	
	static int findBNumbers(int[] nums) {
		int count=0;
		
		for(int num:nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}
	
	//function to check whethere a number contains even digits 
	static boolean even(int nums) {
	int numbersofDigits=digits(nums);
//	if(numbersofDigits %2==0) {
//		return true;
//	}
	
	return numbersofDigits %2==0;
	}
	static int digits(int num) {
		int count=0;
		
		while(num>0) {
			count++;
			num=num/10;
		}
		
		return count;
	}
}
