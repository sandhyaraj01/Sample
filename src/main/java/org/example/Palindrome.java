package org.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {

        //palindrome of String
        String s = "sandhya";

        //reversing a string
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);


        final var reversedString = IntStream.rangeClosed(1, s.length())
                .mapToObj(i -> s.charAt(s.length() - i))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(reversedString);




    }
}
