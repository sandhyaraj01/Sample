package org.basic;

public class IntegerPalindrome {
    public static void main(String[] args) {

        //reverse of number is equal to original number then it is palindrome

        int num = 1231;

        int temp = num;
        int rev = 0;
        while (num > 0) {
            rev = (rev * 10) + num % 10;
            num /= 10;
        }
        if (rev == temp) {
            System.out.println("yes palindrome");
        } else {
            System.out.println("No palindrome");
        }
    }
}
