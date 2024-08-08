package org.employee;

import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.getSalary(), o1.getSalary());
    }
}
