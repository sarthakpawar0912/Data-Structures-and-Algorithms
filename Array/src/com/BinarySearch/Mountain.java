package com.BinarySearch;

public class Mountain {
	//https://leetcode.com/problems/peak-index-in-a-mountain-array/
	public static void main(String[] args) {
		
	}
	

	public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
    
        while(start<end) {
		int mid=start+(end-start)/2;
		if(arr[mid]>arr[mid+1]) {
			//you are decreasing part of array
			//this may be the ans but look at left
			//thats why end!=mid-1
			end=mid;
		}else {
			//you are in asc part off array
			start=mid+1;
			//becuase we know that mid+1 element > mid element
			
		}
	}

       //in the end ,start==end and pointing to the largest number because of the 2 checks of above
        //start and end are alwaays trying to find max element in the above checks
        //hence ,when they are pointing to just one element ,that is max one becausethat is what checeks say
        //more elaboration:at every point of time start and end,they have the best possible answer till that time
        //and if we are saying that only one item is remaining ,hence cuz of above that is the best possible answer
        return  start;//as both start and end are equal
        
        
        
  }
}
