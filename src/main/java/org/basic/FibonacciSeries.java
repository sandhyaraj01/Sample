package org.basic;

public class FibonacciSeries {

    public static void main(String[] args) {

        //0 1 1 2 3 5 8 13 21 34 55.......

        final var n = 10;
        int fib1 = 0;
        int fib2 = 1;

        System.out.println(fib1 + "\n" + fib2);
        for (int i = 2; i <= n; i++) {
            int fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;

            System.out.println(fib3);
        }
    }
}
