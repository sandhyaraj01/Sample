package org.employee;


import lombok.*;

import java.util.Comparator;
import java.util.Objects;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Employee implements Comparable<Employee> {

    private Integer id;
    private String name;
    private int age;
    private double salary;
    private String city;

    //name compare
    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (obj == this)
            return true;
        Employee e = (Employee) obj;
        return Objects.equals(id, e.id);
    }
}
