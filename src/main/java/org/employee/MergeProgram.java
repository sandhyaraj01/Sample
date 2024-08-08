package org.employee;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeProgram {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 4, 5}, arr2 = {2, 4, 6, 8};

        final var arr3 = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(arr3));

        int[] c = new int[arr1.length + arr2.length];
        int k= 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] < arr2[j]) {
                    c[k++] = arr1[i];
                } else {
                    c[i] = arr2[j];
                }

            }
        }
    }
}
