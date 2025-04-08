package Sorting.Selection;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {56, 34, 863, 72, 91};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Find the max item in the array and swap it with the correct index
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, last, max);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) { // Include end index in the loop
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
