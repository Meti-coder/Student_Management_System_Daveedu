package com.modus.project.EmployeeManagementSystem.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class EmployeeRequest {
    private String name;
    private String employeeID;
    private String emailID;
    private String phone;
    private String password;

}
