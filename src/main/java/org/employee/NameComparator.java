package org.employee;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getName(),o2.getName());
        //return o1.getName().compareTo(o2.getName());
    }

}
