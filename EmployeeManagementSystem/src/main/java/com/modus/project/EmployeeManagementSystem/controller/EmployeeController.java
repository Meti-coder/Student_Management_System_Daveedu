package com.modus.project.EmployeeManagementSystem.controller;

import com.modus.project.EmployeeManagementSystem.dto.EmployeeRequest;
import com.modus.project.EmployeeManagementSystem.dto.EmployeeResponse;
import com.modus.project.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/registerEmployee")
    public ResponseEntity<EmployeeResponse> register(@RequestBody EmployeeRequest request) {
        EmployeeResponse response = employeeService.employeeRegister(request);

        if (response.getStatusCode() == 200) {
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }
}
