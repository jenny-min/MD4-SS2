package com.session02.employee_management.repository;

import com.session02.employee_management.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Employee save(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public Optional<Employee> findById(int id) {
        return employees.stream().filter(e -> e.getId() == id).findFirst();
    }

    public void updateEmployee(int id, Employee newEmployee) {
        findById(id).ifPresent(e -> {
            e.setFullName(newEmployee.getFullName());
            e.setEmail(newEmployee.getEmail());
            e.setDepartement(newEmployee.getDepartement());
        });
    }

    public boolean delete(int id) {
       return employees.removeIf(e -> e.getId() == id);
    }
}
