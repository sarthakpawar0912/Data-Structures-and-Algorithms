package com.BinarySearch;

public class Floor {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,7,8,10,14,18,44};
		int target=7;
		int ans=floor(arr, target);
		System.out.println(ans);
	}
	
	//retrun the index
	//return -1 if it does not exst
	static int floor (int[] arr,int target) {
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
		return end;
	}
}
