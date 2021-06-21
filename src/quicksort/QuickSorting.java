/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 02-06-2021
    Time: 03:18 PM
    File: QuickSorting.java 
*/
package quicksort;

public class QuickSorting {
    public void quickSort(int[] arr, int lower, int upper) {
        if (lower >= upper) {
            return;
        }
        int pivotIndex = partition(arr, lower, upper);
    }
}