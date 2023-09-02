package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Create an employee
    @PostMapping("/employees")
    public ResponseEntity<Map<String, Boolean>> createEmployee(@RequestBody Employee employee) {
        employeeRepository.insert(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("created", true);
        return ResponseEntity.ok(response);
    }

    // Get employee by ID
    @GetMapping("/employees/{empId}")
    public Employee getEmployeeById(@PathVariable Integer empId) {
        return employeeRepository.findById(empId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with empId: " + empId));
    }

    // Update employee by ID
    @PutMapping("/employees/{empId}")
    public ResponseEntity<Map<String, Boolean>> updateEmployee(@PathVariable Integer empId, @RequestBody Employee employeeDetails) {
        Employee employee = employeeRepository.findById(empId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with empId: " + empId));
        
        employee.setEmpName(employeeDetails.getEmpName());
        employee.setEmpDeptId(employeeDetails.getEmpDeptId());
        employee.setInTime(employeeDetails.getInTime());
        employee.setOutTime(employeeDetails.getOutTime());
        employee.setFaceId(employeeDetails.getFaceId());
        
        employeeRepository.update(employee);
        
        Map<String, Boolean> response = new HashMap<>();
        response.put("updated", true);
        return ResponseEntity.ok(response);
    }

    // Delete employee by ID
    @DeleteMapping("/employees/{empId}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Integer empId) {
        Employee employee = employeeRepository.findById(empId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with empId: " + empId));
        
        employeeRepository.deleteById(empId);
        
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", true);
        return ResponseEntity.ok(response);
    }
}
