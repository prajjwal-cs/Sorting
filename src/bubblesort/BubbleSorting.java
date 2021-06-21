/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 27-05-2021
    Time: 00:17
    File: BubbleSorting.java 
*/
package bubblesort;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {10, 5, 9, 20, 15, 2};
        System.out.println("Unsorted -->" + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted -->" + Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        // Step 1:
        for (int i = 0; i < arr.length-1; i++) {
            // Step 2:
            for (int j = 0; j < arr.length-1-i; j++) {
                // Step 3
                // Swapping
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}