package com.example.lap6.controller;

import com.example.lap6.model.Employee;
import com.example.lap6.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/registration")
    public String reg(Map<String, Employee> model) {
        Employee employee = new Employee();
        model.put("employee", employee);
        return "registration";
    }

    @GetMapping("/list")
    public String listOfEmployee(Model model){
        List<Employee> listEmployees = employeeService.getAllEmployee();
        System.out.println(listEmployees.size());
        model.addAttribute("lstEmployees", listEmployees);
        return "employeeList";
    }

    @PostMapping("/home")
    public String createEmp(@ModelAttribute("employee") Employee employee){
        employeeService.createOrUpdateEmployee(employee);
        return "redirect:/list";
    }

    @PostMapping("/delete")
    public String deleteEmp(@RequestParam("id") String id){
        employeeService.deleteEmploy(Long.parseLong(id));
        return "redirect:/list";
    }

    @GetMapping("edit")
    public String editEmp(@RequestParam("id") String id, Map<String, Employee> model){
        Employee emp = employeeService.editEmployee(Long.parseLong(id));
        model.put("employee",emp);
        return "registration";
    }

}
