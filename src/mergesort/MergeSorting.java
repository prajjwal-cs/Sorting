/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri
    Date: 24-06-2021
    Time: 08:40 PM
    File: MergeSorting.java 
*/
package mergesort;

public class MergeSorting {
    public static void main(String[] args) {
        int arr[] ={90, 23, 101, 45, 65, 67, 89, 34};
        MergeSorting ob = new MergeSorting();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    void merge(int[] arr, int beg, int mid, int end) {

        int l = mid - beg + 1;
        int r = end - mid;

        int[] LeftArray = new int[l];
        int[] RightArray =new int[r];

        for (int i = 0; i < l; ++i)
            LeftArray[i] = arr[beg + i];

        for (int j = 0; j < r; ++j)
            RightArray[j] = arr[mid + 1 + j];


        int i = 0, j = 0;
        int k = beg;
        while (i < l && j < r) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < r) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    void sort(int[] arr, int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            sort(arr, beg, mid);
            sort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }
}