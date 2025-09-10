package com.modus.project.EmployeeManagementSystem.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class EmployeeResponse {
    private final int statusCode;
    private final String userID;
    private  final String reason;

    public EmployeeResponse(int statusCode, String userID, String reason) {
        this.statusCode = statusCode;
        this.userID = userID;
        this.reason = reason;
    }


    public EmployeeResponse(int statusCode, String reason) {
        this.statusCode = statusCode;
        this.userID = null;
        this.reason = reason;
    }

}
