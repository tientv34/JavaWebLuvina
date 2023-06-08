package com.example.lap6.service;

import com.example.lap6.model.Employee;
import com.example.lap6.repositorys.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createOrUpdateEmployee(Employee emp) {
        employeeRepository.save(emp);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmploy(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee editEmployee(Long id) {
        Employee emp = employeeRepository.getOne(id);
        return emp;
    }

    @Override
    public Employee getEmployeeByID(Long id) {
        return employeeRepository.findById(id).get();
    }
}
