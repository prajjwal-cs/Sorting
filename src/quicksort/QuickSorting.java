/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 02-06-2021
    Time: 03:18 PM
    File: QuickSorting.java 
*/
package quicksort;

public class QuickSorting {
    public static void main(String[] args) {
        int i;
        int[] arr = {90, 101, 45, 65, 23, 67, 89, 34};
        quickSort(arr, 0, 7);
        System.out.println("The sorted array is:");
        for (i = 0; i < 7; i++)
            System.out.print(arr[i] + ", ");
    }

    public static int partition(int[] a, int beg, int end) {

        int left, right, temp, loc, flag;
        loc = left = beg;
        right = end;
        flag = 0;
        while (flag != 1) {
            while ((a[loc] <= a[right]) && (loc != right))
                right--;
            if (loc == right)
                flag = 1;
            else if(a[loc] > a[right]) {
                temp = a[loc];
                a[loc] = a[right];
                a[right] = temp;
                loc = right;
            }
            if (flag != 1) {
                while ((a[loc] >= a[left]) && (loc != left))
                    left++;
                if (loc == left)
                    flag = 1;
                else if(a[loc] < a[left]) {
                    temp = a[loc];
                    a[loc] = a[left];
                    a[left] = temp;
                    loc = left;
                }
            }
        }
        return loc;
    }

    static void quickSort(int[] a, int beg, int end) {

        int loc;
        if (beg < end) {
            loc = partition(a, beg, end);
            quickSort(a, beg, loc - 1);
            quickSort(a, loc + 1, end);
        }
    }
}