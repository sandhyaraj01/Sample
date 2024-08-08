package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EquilibriumIndexOfArray {

    public static void main(String[] args) {

        int[] a = {-7, 1, 5, 2, -4, 3, 0, 1};

        int low = 0;
        int high = a.length - 1;
        int mid = low + high / 2;

        final var sum1 = Arrays.stream(a).limit(mid).sum();

        //Stream.of(a).flatMapToInt(Arrays::stream).limit(mid).sum();
        final var sum2 = Arrays.stream(a).skip(mid + 1).sum();
        if (sum1 == sum2) {
            System.out.println("equilibrium index : " + mid);
        }
        System.out.println(mid);
    }
}
