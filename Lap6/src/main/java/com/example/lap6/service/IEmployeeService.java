package com.example.lap6.service;

import com.example.lap6.model.Employee;

import java.util.List;

public interface IEmployeeService {
    void createOrUpdateEmployee (Employee emp);
    List<Employee> getAllEmployee();
    void deleteEmploy(Long id);
    Employee editEmployee(Long id);
    Employee getEmployeeByID(Long id);
}
