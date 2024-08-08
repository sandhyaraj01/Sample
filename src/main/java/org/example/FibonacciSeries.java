package org.example;

public class FibonacciSeries {

    public static void main(String[] args) {

        //most efficient time complexity of O(n) and a space complexity of O(1)
        int fib1 = 0;
        int fib2 = 1;

        System.out.println(fib1 + " " + fib2 + " ");
        int n = 10;
        for(int i = 2; i < n ; i++ )
        {
            int fib3 = fib1 + fib2;
            System.out.println(fib3 + " ");
            fib1 = fib2;
            fib2 = fib3;
        }

    }
}
