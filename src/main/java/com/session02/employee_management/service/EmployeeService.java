package com.session02.employee_management.service;

import com.session02.employee_management.model.Employee;
import com.session02.employee_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.getEmployees();
    }

    public Employee getEmployeeById(int id) {
        return  employeeRepository.getEmployees().get(id);
    }

    public List<Employee> searchByName(String name) {
        return employeeRepository.getEmployees().stream()
                .filter(e -> e.getFullName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
}
