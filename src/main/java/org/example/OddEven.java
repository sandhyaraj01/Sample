package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddEven {

    public static void main(String[] args) {

        int[] a = {1, 3, 4, 6, 7, 9, 10, 11, 23, 11, 23, 5};

        //collect even and odd elements
        Map<Boolean, List<Integer>> oddEvenMap = Arrays.stream(a).boxed().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(oddEvenMap);

        //Remove duplicate elements from the list

        Arrays.stream(a).boxed().distinct().forEach(System.out::println);

        //frequency of each character in given string

        String name = "Senior Software Eng";

        final var charMap = name.replace(" ", "").toLowerCase().chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(charMap);

        //sort the list in reverse order
        oddEvenMap.entrySet().stream().filter(Map.Entry::getKey).map(Map.Entry::getValue)
                .flatMap(List::stream).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //Join List of Strings with prefix, delimiter and suffix
        List<String> slist = List.of("sandhya", "is", "a", "super", "star");

        String updateName = slist.stream().collect(Collectors.joining("-", "#", "."));
        System.out.println(updateName);

        Integer maxValue = Arrays.stream(a).mapToObj(i-> (Integer) i).max(Comparator.naturalOrder()).stream().findFirst().orElse(0);
        Integer minValue = Arrays.stream(a).boxed().min(Comparator.naturalOrder()).stream().findFirst().orElse(0);
        System.out.println(maxValue);
        System.out.println(minValue);

        final var max = Stream.of(1, 2, 4, 5, 7, 8, 9, 14, 2, 5, 20).distinct().max(Comparator.comparing(Integer::intValue)).orElse(0);
        System.out.println("MAx value:" + max);

        //merge two unsorted arrays into single sorted array

        int[] a1 = {8, 9, 2, 3};
        int[] a2 = {1, 6, 3, 5};

        //single loop sorting technique
        for (int i = 0; i < a1.length - 1; i++) {
            if (a1[i] > a1[i + 1]) {
                int temp = a1[i];
                a1[i] = a1[i + 1];
                a1[i + 1] = temp;

                i = -1;
            }
        }

        for (int i = 0; i < a2.length; i++) {
            for (int j = i + 1; j < a2.length; j++) {

                if (a2[i] > a2[j]) {
                    int temp = a2[i];
                    a2[i] = a2[j];
                    a2[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        //learn merge sort
        int[] sortedArray = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(sortedArray));

        String str1 = "sandhiya";
        String str2 = "sanidhya";

        str1 = str1.toLowerCase(Locale.ROOT).chars().mapToObj(ch -> (char) ch).sorted().map(String::valueOf).collect(Collectors.joining());
        str2 = str2.toLowerCase(Locale.ROOT).chars().mapToObj(ch -> (char) ch).sorted().map(String::valueOf).collect(Collectors.joining());

        System.out.println(str1.equals(str2));
        System.out.println(str1);
        System.out.println(str2);

        int number = 123456;
        int n = number;
        //sum of all digits of number
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number /= 10;
        }

        System.out.println(sum);

        Integer sumOfNumber = String.valueOf(n).chars().map(Character::getNumericValue).sum();
        System.out.println(sumOfNumber);


    }
}