package com.example.demo.dto;

import lombok.Data;

/**
 * EmpDto
 */
@Data 
public class Emp {
    private Long empId;
    private String empName;
    private String email;
    // private Long deptId;
    // private String jobCode;
    // private int salary;
    // private Long managerId;
    // private LocalDate hireDate;
    // private boolean active;
    private String deptTitle;
    private String jobName;
}
