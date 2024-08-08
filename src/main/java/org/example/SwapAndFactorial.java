package org.example;

import java.awt.print.PrinterGraphics;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SwapAndFactorial {

    public static void main(String[] args) {

        int a = 10;
        int b = 50;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " and " + b);

        //factorial
        // n! = n * (n-1) * (n-2)....
        int n = 5;
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

        int result = 1;
        n = 5;
        while(n>0) {
            result = result * n--;
        }
        System.out.println(result);

        //palindrome
        //integer

        int palNumber = 121;

        System.out.println("using normal loop : ");

        int reverseNumber = 0;

        while (palNumber > 0) {
            reverseNumber = (reverseNumber  * 10)+ (palNumber % 10);
            palNumber /= 10;
        }
        System.out.println(reverseNumber);

        System.out.println("2. using other way");

        String palString = String.valueOf(reverseNumber);
        StringBuilder reversePal = new StringBuilder();
        for(int i = palString.length() - 1 ; i>=0; i--) {
            reversePal.append(palString.charAt(i));
        }

        System.out.println(reversePal);

        System.out.println("Reverse a linked list");

        LinkedList<String> list = new LinkedList<>();
        list.add("anny");
        list.add("mopy");
        list.add("kiya");
        list.add(2,"kanya");
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);


        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //second largest number in array

        Integer[] arr = new Integer[]{1,2,3,4,5,6};

        int maxvalue = Arrays.stream(arr).max(Integer::compareTo).stream().findFirst().orElse(0);
        System.out.println("max:"+maxvalue);
        int[] set = Arrays.stream(arr).sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
        System.out.println(set[1]);

        //remove given value from a list

        List<String> names = new ArrayList<>(Arrays.asList("sandhya", "saaya", "sandhu", "sany", "riya"));
        String toRemove = "saaya";

        boolean removed = names.remove("saaya");
        System.out.println(names);

        names.stream().filter(name -> !name.equals("riya")).forEach(System.out::println);

        //To update city


    }
}
