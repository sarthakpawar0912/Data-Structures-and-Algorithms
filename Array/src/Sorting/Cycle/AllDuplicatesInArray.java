package Sorting.Cycle;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class AllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        
        // Perform cyclic sort
        while (i < arr.length) {
            int correct = arr[i] - 1; // Correct index for the current number
            
            if (arr[i] != arr[correct]) {
                // Swap if the number is not in the correct position
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        
        // Collect duplicates
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    
    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
