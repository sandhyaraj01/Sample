package org.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        //Normal sorting
        int[] a = {3, 60, 35, 2, 45, 320, 5};
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        a = new int[]{3, 60, 35, 2, 45, 320, 5};
        //bubble sort
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap a[j] and a[j + 1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, break
            if (!swapped) break;
        }
        System.out.println(Arrays.toString(a));


    }
}
