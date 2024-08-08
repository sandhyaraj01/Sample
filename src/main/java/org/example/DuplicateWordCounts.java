package org.example;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordCounts {

    public static void main(String[] args) {

        final var value = "Java test program java TEST PROGRAM pROGram";

        String[] values = value.split(" ");

        final var map = Arrays.stream(values).map(String::toUpperCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().forEach(System.out::println);
    }
}
