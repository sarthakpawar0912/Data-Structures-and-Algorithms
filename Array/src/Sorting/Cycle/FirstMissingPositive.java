package Sorting.Cycle;

// https://leetcode.com/problems/first-missing-positive/description/
public class FirstMissingPositive {

    public int firstMissingPositive(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; // Calculate the correct position for arr[i]

            // Swap only if arr[i] is within range and not already in its correct position
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Search for the first missing positive
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // If all numbers are in place, return the next positive number
        return arr.length + 1;
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
