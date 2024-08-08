package org.basic;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PrimeNumber {

    public static void main(String[] args) {

        //Program to verify whether a given number is a prime or composite.
        //A number divisible by 1 and itself i.e, prime number

        int[] a = {1, 2, 3, 6, 7, 10, 31, 55, 64};

        final var primeArray = Arrays.stream(a).filter(PrimeNumber::isPrime).toArray();
        System.out.println(Arrays.toString(primeArray));
    }

    // n -> [2 - n-1] or O(N) timecomplexity
    //In this method, the check is done from 2 to n/2 as a number is not divisible by more than half its value. O(N) timecomplexity

    private static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
