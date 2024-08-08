package org.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverse {

    public static void main(String[] args) {

        String name = "Kushani";

        System.out.println("1. using built in function");
        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb.reverse());


        System.out.println("2. using custom ");

        final var chars = name.toCharArray();
        //how to sort an Array
        StringBuilder s = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            s.append(chars[i]);
        }

        System.out.println(s);
        System.out.println("3. using streams ");
        final var reversedString = IntStream.rangeClosed(1, name.length())
                .mapToObj(i -> name.charAt(name.length() - i))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(reversedString);

    }
}
