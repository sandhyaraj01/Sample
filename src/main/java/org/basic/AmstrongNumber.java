package org.basic;

public class AmstrongNumber {

    public static void main(String[] args) {

        //An Armstrong number is equal to the sum of the cubes of its digits.
        int num = 153;

        int amSum = String.valueOf(num).chars().map(Character::getNumericValue).map(i -> i * i * i).sum();
        if (amSum == num) {
            System.out.println("It is amStrong number");
        } else {
            System.out.println("It is not an amStrong number");
        }

        int amNum = 0;
        while (num > 0) {

            int mod = num % 10;
            amNum += (int) Math.pow(mod, 3);
            num /= 10;
        }
        System.out.println(amNum);


    }

}
