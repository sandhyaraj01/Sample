package org.example;

import java.util.OptionalInt;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class Number {

    public static void main(String[] args) {

        int[] a = {1, 2, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int j : a) {
            sum += j;
        }

        int number = 234;
        int finalSum = String.valueOf(number).chars().map(Character::getNumericValue).sum();
        System.out.println(finalSum);

        int mul = String.valueOf(number).chars().map(Character::getNumericValue).reduce((a1, b1) -> a1 * b1).getAsInt();
        System.out.println(mul);

        int sumOfNumber = 0;
        while (number > 0) {

            sumOfNumber += number % 10;
            number /= 10;

        }
        System.out.println(sumOfNumber);
        System.out.println(sum);

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 2 * 2;
        }).thenApply(result -> result + 1);

        future.thenAccept(result -> System.out.println("Final Result: " + result));

        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 5);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 10);

        CompletableFuture.allOf(future1, future2).join();

        try {
            System.out.println(future1.get());
            System.out.println(future2.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
