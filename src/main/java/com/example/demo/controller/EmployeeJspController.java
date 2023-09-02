package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequestMapping("/jsp")
public class EmployeeJspController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @RequestMapping(value = "/viewEmployees", method = RequestMethod.GET)
    public String viewEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "view-employees"; // Assuming you have a JSP view named "view-employees.jsp"
    }

    @GetMapping("/registerEmployee")
    public String showForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "registerEmployee"; // Assuming you have a JSP view named "registerEmployee.jsp"
    }

    @PostMapping("/registerEmployee")
    public String submitForm(@ModelAttribute("employee") Employee employee) {
        employeeRepository.insert(employee);
        return "register_success"; // Assuming you have a JSP view named "register_success.jsp"
    }
}
