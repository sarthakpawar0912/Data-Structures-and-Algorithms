package com.BinarySearch;

//ceiling of a number is a technique in which the 
// ceiling=smallest elemnt in array greater or =target
//arr=[2,3,5,9,14,16,18]    
//ceiling (arr,target=14)=14
//ceiling (arr,target=15)=16
//ceiling (arr,target=4)=5
//ceiling (arr,target9)=9

public class Smallestletter {

	public static void main(String[] args) {
		char[] arr= {'c','f','g'};
		char target='a';
		char ans=nextGreatestLetter(arr, target);
		System.out.println(ans);
	}
	
	
	  public static char nextGreatestLetter(char[] letters, char target) {
		  	int start=0;
			int end=letters.length-1;
			while(start<=end) {
				//find middle element
			//	int mid=(start=end)/2;
				int mid=start+(end-start)/2;
				
				if(target <letters[mid]) {
					end=mid-1;
				}
				else{
					start=mid+1;
				}
			}
			return  (letters[start%letters.length]);  
	    }
	}
