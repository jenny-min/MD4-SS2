package com.session02.employee_management.repository;

import com.session02.employee_management.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmployeeRepository {
    private ArrayList<Employee> employees;
}
