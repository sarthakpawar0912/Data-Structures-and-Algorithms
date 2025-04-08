package Sorting.Cycle;
//https://leetcode.com/problems/find-the-duplicate-number/description/

public class DuplicateNumber {
	public int findDuplicate(int[] arr) {
        int i = 0;
        // Perform cyclic sort for the array
        while (i < arr.length) {
            if (arr[i] != i + 1) { 
                int correct = arr[i] - 1; // Correct index for current number
                
                if (arr[i] != arr[correct]) {
                    // Swap if the number is not at its correct position
                    swap(arr, i, correct);
                } else {
                    // Duplicate found
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        // If no duplicate found (shouldn't happen in valid input)
        return -1;
    }
    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }


}
