package org.example;

import java.util.concurrent.*;

public class CompletableFutureExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running computation
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            // Uncomment the following line to simulate an exception
            //throw new RuntimeException("Computation error!");
             return 42;
        }, executor);

        future.thenAccept(result -> {
            System.out.println("Result: " + result);
        }).exceptionally(ex -> {
            System.out.println("Exception occurred: " + ex.getMessage());
            // Rethrow the exception to propagate it
            throw new CompletionException(ex);
        }).handle((result, ex) -> {
            if (ex != null) {
                System.out.println("Handling the propagated exception: " + ex.getMessage());
            }
            return result;
        }).thenRun(() -> {
            executor.shutdown();
            try {
                if (!executor.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                    executor.shutdownNow();
                }
            } catch (InterruptedException e) {
                executor.shutdownNow();
            }
            System.out.println("Executor shutdown complete.");
        });
    }
}
