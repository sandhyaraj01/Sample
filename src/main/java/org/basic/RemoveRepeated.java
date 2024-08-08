package org.basic;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveRepeated {

    public static void main(String[] args) {

        //1.  Removing repeated elements from an array

        int[] a = {1, 2, 3, 4, 1, 2, 5, 7, 9, 2};
        Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(map -> map.getValue() == 1).forEach(System.out::println);

        String name = "ammulu";
        name.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(map -> map.getValue() == 1).forEach(System.out::println);

        String[] names = {"sandhya", "raja", "kushani", "sandhya"};
        Arrays.stream(names).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(map -> map.getValue() > 1).forEach(System.out::println);

    }
}
