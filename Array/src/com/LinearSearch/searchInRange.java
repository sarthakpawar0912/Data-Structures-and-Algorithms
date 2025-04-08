package com.LinearSearch;

public class searchInRange {

	public static void main(String[] args) {
		
		int[] arr= {18,12,-7,3,14,28};
		int target =18;
		System.out.println(linearSearch(arr, target, 1, 6));
	}
	
	static int linearSearch(int[] arr,int target,int start,int end) {
		if(arr.length == 0) {
			return -1;
		}

		//run a for loop
		for(int index=start;index<end;index++) {
			//check for element at every  index if it is = target
			int element=arr[index];
			if(element == target) {
				return index;
			}
		}
		//this line will execute if none of the return statements above have been executed
		//hence target havent found
		return -1;
		
	}
	
	
	
	
	
	
	
}
