package org.employee;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public final class EmployeeImmutable {

    private final String name;
    private final String department;
    private final Map<String, String> departmentMap;

    public EmployeeImmutable(String name, String department, Map<String, String> departmentMap) {
        this.name = name;
        this.department = department;
        this.departmentMap = new HashMap<>(departmentMap); //deepCopy
    }

    //only getters

}

