package com.BinarySearch;

//ceiling of a number is a technique in which the 
// ceiling=smallest elemnt in array greater or =target
//arr=[2,3,5,9,14,16,18]    
//ceiling (arr,target=14)=14
//ceiling (arr,target=15)=16
//ceiling (arr,target=4)=5
//ceiling (arr,target9)=9

public class CeilingNumber {

	public static void main(String[] args) {
		int[] arr= {2,3,5,9,14,16,18};
		int target=15;
		int ans=ceiling(arr, target);
		System.out.println(ans);
	}
	
	//retrun the index
	//return -1 if it does not exst
	static int ceiling (int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			//find middle element
		//	int mid=(start=end)/2;
			int mid=start+(end-start)/2;
			
			if(target <arr[mid]) {
				end=mid-1;
			}
			else if (target > arr[mid]){
				start=mid+1;
			}else {
				//ans
				return mid;
			}
		}
		return start;
	}
}
