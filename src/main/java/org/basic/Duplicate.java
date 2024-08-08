package org.basic;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(String[] args) {

        //Write a Java program to find duplicate elements in an array using a Set.

        List<String> names = Arrays.asList("sandhya", "saanvi", "kushan", "sandhya", "raja", "raja", "sandhya");

        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String name : names) {
            if (!seen.add(name)) {
                duplicates.add(name);
            }
        }

        seen.removeAll(duplicates);

        System.out.println("Unique elements: " + seen);
        System.out.println("Duplicate elements: " + duplicates);

        final var duplicateAndNonDuplicated = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .collect(Collectors.partitioningBy(m -> m.getValue() > 1));
        System.out.println(duplicateAndNonDuplicated);

        //Frequency of Characters in String using Map

        String name = "Sandhya Raj";
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for (char ch : name.replaceAll("\\s+", "").toLowerCase().toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println(charMap);

    }
}
