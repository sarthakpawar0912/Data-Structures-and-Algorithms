package Sorting.Bubble;
import java.util.Arrays;
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {54, 4, 83, 2, 891};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    

    static void bubble(int[] arr) {
        // Run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            // For each step, the max item will come at the last index
            for (int j = 1; j < arr.length - i; j++) {
                // Swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}
