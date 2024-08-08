package org.employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "sandhya", 22, 100000, "mysore");
        Employee e2 = new Employee(3, "riya", 22, 200000, "shimoga");
        Employee e3 = new Employee(2, "kathy", 26, 500000, "shimoga");

        List<Employee> employeeList = new ArrayList<>(List.of(e1, e2, e3));

        //custom sort
        employeeList.sort(Collections.reverseOrder());
        System.out.println("Using custom");
        //System.out.println(employeeList);

        employeeList.sort(new SalaryComparator());
        Collections.sort(employeeList, new SalaryComparator());
        System.out.println(employeeList);

        //java 8
        System.out.println("Using Java 8");
        final var nameSortList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed()).toList();
        System.out.println(nameSortList);

        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);

        Employee e4 = new Employee(1, "sandhyaraj", 22, 100000, "mysore");

        System.out.println(e1 == e4);
        System.out.println(e1.equals(e4));

        System.out.println(e1.hashCode());
        System.out.println(e4.hashCode());

        int n = 121;

        int sum = 1;

        while (n > 0) {
            sum = sum * n % 10;
            n /= 10;
        }
        System.out.println(sum);


        employeeList.stream().collect(Collectors.groupingBy(Employee::getAge,
                Collectors.averagingDouble(Employee::getSalary))).entrySet().forEach(System.out::println);


    }
}
