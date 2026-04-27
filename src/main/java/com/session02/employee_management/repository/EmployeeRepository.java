package com.session02.employee_management.repository;

import com.session02.employee_management.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    private final List<Employee> employees = new ArrayList<>();

    public EmployeeRepository() {
        employees.add(new Employee(1, "Nguyễn Văn A", "nva@gmail.com", "IT"));
        employees.add(new Employee(2, "Vũ Thị B", "vtb@gmail.com", "HR"));
        employees.add(new Employee(3, "Trần Văn C", "tvc@gmail.com", "IT"));
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
