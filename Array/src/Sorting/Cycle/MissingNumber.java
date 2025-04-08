package Sorting.Cycle;

import java.util.Arrays;
//amazon question
//https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
	
	
	
		public int missingNumber(int arr[]) {
			int i=0;
			while(i<arr.length) {
				int correct=arr[i];
				if(arr[i]<arr.length && arr[i] !=arr[correct]){
					swap(arr,i,correct);	
				}else {
					i++;
				}
			}
			//search for element
			for(int index=0;index<arr.length;index++) {
				if(arr[index] != index) {
					return index;
				}
			}
			//case 2
			return arr.length;
					
		}
		private static void swap(int[] arr, int i, int correct) {
	        int temp = arr[i];
	        arr[i] = arr[correct];
	        arr[correct] = temp;
	    }	
    

}
