package com.example.fibabankhomework3.Entity;

import javax.persistence.*;

@Entity
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    private String employeeName;
    private double mothlySalary;
    @ManyToOne()
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee() {
    }

    public Employee(long employeeId, String employeeName, double mothlySalary, Department department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.mothlySalary = mothlySalary;
        this.department = department;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getMothlySalary() {
        return mothlySalary;
    }

    public void setMothlySalary(double mothlySalary) {
        this.mothlySalary = mothlySalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
