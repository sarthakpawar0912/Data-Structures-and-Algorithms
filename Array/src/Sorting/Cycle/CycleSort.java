package Sorting.Cycle;

import java.util.Arrays;
public class CycleSort {

	public static void main(String[] args) {

		int[] arr= {5,4,3,2,1};
		cycle(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void cycle(int arr[]) {

		int i=0;
		while(i<arr.length) {
			int correct=arr[i]-1;
			if(arr[i] !=arr[correct]){
				swap(arr,i,correct);	
			}else {
				i++;
			}
		}
	}

	private static void swap(int[] arr, int i, int correct) {

        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;

	}
}
