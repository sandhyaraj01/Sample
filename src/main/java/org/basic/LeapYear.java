package org.basic;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2019;
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                leap = year % 400 == 0;
            }
            else {
                leap = true;
            }
        } else {
            leap = false;
        }

        if(leap) {
            System.out.println("yes it is a leap year");
        } else {
            System.out.println("No it is not leap year");
        }
    }
}
