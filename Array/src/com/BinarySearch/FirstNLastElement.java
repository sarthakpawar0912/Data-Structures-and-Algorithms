package com.BinarySearch;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstNLastElement {

	public static void main(String[] args) {
		
	}

	public int[] searchRange(int[] nums, int target) {
		
		int[] ans= {-1,-1};
		int start=search( nums,  target, true);
		int end=search(nums, target, false);
		ans[0]=start;
		ans[1]=end;
		
		return ans;
    }
	//this function is just returns the index value of target
	int search(int[] nums,int target,boolean findstartIndex) {
		int ans=-1;
		int start=0;
		int end=nums.length-1;
		while(start<=end) {
			//find middle element
		//	int mid=(start=end)/2;
			int mid=start+(end-start)/2;
			
			if(target <nums[mid]) {
				end=mid-1;
			}
			else if (target > nums[mid]){
				start=mid+1;
			}else {
				//potential ans is found
				ans=mid;
				if(findstartIndex ) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}
		}
		return ans;
		
		
	}
}
