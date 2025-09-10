package com.modus.project.EmployeeManagementSystem.service;

import com.modus.project.EmployeeManagementSystem.dto.EmployeeRequest;
import com.modus.project.EmployeeManagementSystem.dto.EmployeeResponse;
import com.modus.project.EmployeeManagementSystem.entity.Employee;
import com.modus.project.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    public EmployeeResponse employeeRegister(EmployeeRequest request){
        if (employeeRepo.existsByEmployeeID(request.getEmployeeID())){

            return new EmployeeResponse(400,null,"Employee ID already exists");

        }

        String userID = generateUserID(request.getEmployeeID(), request.getName());

        Employee employee = new Employee();
        employee.setUserID(userID);
        employee.setName(request.getName());
        employee.setEmployeeID(request.getEmployeeID());
        employee.setEmailID(request.getEmailID());
        employee.setPhone(request.getPhone());
        employee.setPassword(request.getPassword());
        employee.setCreatedAt(LocalDateTime.now());
        employee.setModifiedAt(LocalDateTime.now());

        employeeRepo.save(employee);

        return new EmployeeResponse(200, userID, "Employee registered successfully");

    }

        private String generateUserID(String empID, String name) {
            String namePart = name.length() >= 4 ? name.substring(0, 4).toLowerCase() : name.toLowerCase();
            return empID + namePart;
        }
    }

