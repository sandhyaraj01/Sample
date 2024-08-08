package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCount {

    public static void main(String[] args) {
        /*Given a string find out duplicate character and its count .
        Ex: i/p- ”manojpandey”, o/p- a-2,n-2.*/

        String input = "manojpandey";

        Map<Character, Long> map = input.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream().filter(m->m.getValue()>=2)
                .forEach(System.out::println);

        Integer[] arr = new Integer[]{1,2,3,4,5,6};

        final var slarge = Arrays.stream(arr).sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(slarge);

        //find the second-largest integer in the array

        //System.out.println(sortedArray[1]);*/

    }
}
