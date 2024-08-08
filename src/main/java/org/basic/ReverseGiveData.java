package org.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseGiveData {

    public static void main(String[] args) {

        //reversing an array in place

        int[] a = {1, 4, 5, 7, 8, 9};

        int start = 0, end = a.length - 1;

        while (start < end) {

            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(a));


        String name = "sandhya";
        final var nameChars = name.toCharArray();

        int s = 0, e = nameChars.length - 1;
        while (s < e) {
            char temp = nameChars[s];
            nameChars[s] = nameChars[e];
            nameChars[e] = temp;
            s++;
            e--;
        }
        System.out.println(nameChars);

        Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
