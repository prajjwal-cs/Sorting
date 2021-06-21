/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 27-05-2021
    Time: 20:51
    File: SelectionSorting.java 
*/
package selectionsort;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] ar = {5,9,20,15,2};
        System.out.println("Unsorted --> " + Arrays.toString(ar));
        selectionSort(ar);
        System.out.println("Sorted --> " + Arrays.toString(ar));
    }
    public static void selectionSort(int[] arr) {
        int sortedIndex = arr.length;
        int maximumElement;
        int maximumElementIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            maximumElement = arr[0];
            maximumElementIndex = 0;
            for (int j = 1; j < sortedIndex; j++) {
                if (maximumElement < arr[j]) {
                    maximumElement = arr[j];
                    maximumElementIndex = j;
                }
            }
            int temp = arr[maximumElementIndex];
            --sortedIndex;
            arr[maximumElementIndex] = arr[sortedIndex];
            arr[sortedIndex] = temp;
        }
    }
}