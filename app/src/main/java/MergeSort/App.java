/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MergeSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr = {7, 5, 13, 11, 6, 12};
        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));
        MergeSort.sort(arr);
        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(arr));
    }
}
