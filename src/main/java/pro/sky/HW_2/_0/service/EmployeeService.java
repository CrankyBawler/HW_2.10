package pro.sky.HW_2._0.service;

import pro.sky.HW_2._0.Entity.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String lastName, int salary, int department);

    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);

    Collection<Employee> findAll();
}

