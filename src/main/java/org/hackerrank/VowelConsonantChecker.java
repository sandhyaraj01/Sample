package org.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class VowelConsonantChecker {

    // Define vowels
    private static final Set<Character> VOWELS = new HashSet<>();

    static {
        VOWELS.add('a');
        VOWELS.add('e');
        VOWELS.add('i');
        VOWELS.add('o');
        VOWELS.add('u');
        VOWELS.add('A');
        VOWELS.add('E');
        VOWELS.add('I');
        VOWELS.add('O');
        VOWELS.add('U');
    }

    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (VOWELS.contains(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }

    // Method to convert a character to its preceding or succeeding character
    public static char convertChar(char ch) {
        if (ch == 'a') return 'b';
        if (ch == 'A') return 'B';
        if (ch == 'Z') return 'Y';
        if (ch == 'z') return 'y';
        if (Character.isLetter(ch)) {
            char prev = (char) (ch - 1);
            char next = (char) (ch + 1);
            return VOWELS.contains(prev) ? next : prev;
        }
        return ch;
    }

    // Method to check and modify the string
    public static String balanceString(String str) {
        int[] counts = countVowelsAndConsonants(str);
        int vowels = counts[0], consonants = counts[1];

        if (vowels == consonants) {
            return str;  // already balanced
        }

        StringBuilder result = new StringBuilder(str);
        for (int i = 0; i < result.length() && vowels != consonants; i++) {
            char ch = result.charAt(i);
            if (Character.isLetter(ch)) {
                char converted = convertChar(ch);
                if (VOWELS.contains(ch) && !VOWELS.contains(converted)) {
                    vowels--;
                    consonants++;
                } else if (!VOWELS.contains(ch) && VOWELS.contains(converted)) {
                    consonants--;
                    vowels++;
                }
                result.setCharAt(i, converted);
            }
        }

        return result.toString();
    }

    public static boolean isBalanced(String str) {
        int[] counts = countVowelsAndConsonants(str);
        return counts[0] == counts[1];
    }

    public static void main(String[] args) {
        String testStr = "abcdeZ";
        System.out.println("Original string: " + testStr);
        if (isBalanced(testStr)) {
            System.out.println("The string is balanced.");
        } else {
            String balancedStr = balanceString(testStr);
            if (isBalanced(balancedStr)) {
                System.out.println("The string was not balanced, but after modification it is balanced.");
                System.out.println("Balanced string: " + balancedStr);
            } else {
                System.out.println("The string is not balanced and cannot be balanced by the given rules.");
                System.out.println("Attempted balanced string: " + balancedStr);
            }
        }
    }
}
