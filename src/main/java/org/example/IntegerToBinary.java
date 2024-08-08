package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class IntegerToBinary {

    public static void main(String[] args) {

        int num = 10;

        final var binCount =
                Integer.toBinaryString(num).chars().mapToObj(ch -> (char) ch).filter(c -> c == '0').count();

        System.out.println(binCount);

        //List of Integers to list of odd number squares

        int[] a = {1, 2, 3, 4, 5, 6, 7};
        final var oddArray = Arrays.stream(a).filter(n -> n % 2 != 0).mapToDouble(n -> Math.pow(n, 2)).toArray();
        System.out.println(Arrays.toString(oddArray));

        //find subArray with give sum
        int sum = 7;

        for (int i = 0, j = i + 1; i < a.length - 1; i++) {

            final var list = new ArrayList<>();
            int s = a[i];
            list.add(a[i]);
            while (j < a.length - 1) {
                if (s == sum) {
                    System.out.println(list);
                    break;
                } else if (s > sum) {
                    break;
                } else {
                    s += a[j];
                    list.add(a[j++]);
                }
            }
            //System.out.println(list);

        }


    }
}
