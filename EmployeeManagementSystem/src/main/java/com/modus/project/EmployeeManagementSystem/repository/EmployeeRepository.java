package com.modus.project.EmployeeManagementSystem.repository;

import com.modus.project.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,String> {
    boolean existsByEmployeeID(String employeeID);
}
