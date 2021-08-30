package MergeSort;

import java.util.Arrays;


class MergeSort {

    public static int[] sort(int[] arr) {
        sortHelper(arr, 0, arr.length - 1);
        return arr;
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftArray[i] = arr[l + i];

        for (int j = 0; j < n2; ++j)
            rightArray[j] = arr[m +  j + 1 ];

//          System.out.println(Arrays.toString(L));
//          System.out.println(Arrays.toString(R));
        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            System.out.println(i);
            System.out.println(n1+ " ss");
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            System.out.println(i);
            System.out.println(n1+ " zz");
            arr[k] = rightArray[j];
            j++;
            k++;

        }
    }

    private static void sortHelper(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
//          System.out.println("m: " + m + " l: " + l + " r: " + r);
            sortHelper(arr, l, m);
            sortHelper(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}