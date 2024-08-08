package org.basic;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringPalindrome {

    public static void main(String args[]) {

        //Program to verify whether a given string is a palindrome or not.

        /*List<String> names = Arrays.asList("amma", "plaindrome", "malayalam", "devangari");
        final var palNames = names.stream().map(StringPalindrome::isPalindrome).filter(Objects::nonNull).toList();
        System.out.println(palNames);*/

        reverseAString("devanagari");

    }

    /*private static String isPalindrome(String name) {

        StringBuilder sb = new StringBuilder(name);
        if (sb.reverse().toString().equals(name)) {
            return name;
        }
        return null;
    }*/

    private static String isPalindrome(String name) {

        final var revName = IntStream.rangeClosed(1, name.length())
                .mapToObj(i -> name.charAt(name.length() - i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(revName);
        if (name.equals(revName)) {
            return name;
        }
        return null;
    }

    private static void reverseAString(String name) {

        //dev ana gar i

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            str.append(name.charAt((name.length() - 1) - i));
        }
        System.out.println(str);
    }
}
