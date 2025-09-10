package com.modus.project.EmployeeManagementSystem.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="Emp_Master")
public class Employee {

    @Id
    private String userID;

    private String name;
    private String employeeID;
    private String emailID;
    private String phone;
    private String password;
    private String delFlg = "N";

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
