package org.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TriangleTouy {

    public static void main(String[] args) {

        List<String> triangleToy = Arrays.asList("36 36 30", "45 56 100", "30 30 30", "10 20 5");
        List<String> result = classifyTriangles(triangleToy);
        System.out.println(result);
    }

    private static List<String> classifyTriangles(List<String> triangleToy) {

        List<String> result = new ArrayList<>();

        triangleToy.forEach(toy -> {

            final var sides = toy.split("\\s+");
            int a = Integer.parseInt(sides[0]);
            int b = Integer.parseInt(sides[1]);
            int c = Integer.parseInt(sides[2]);


            if (isValidTriangle(a, b, c)) {

                if (a == b && b == c) {
                    result.add("Equilateral");
                } else if (a == b || b == c || a == c) {
                    result.add("Isosceles");
                } else {
                    result.add("valid");
                }
            } else {
                result.add("None of these");
            }

        });
        return result;
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
