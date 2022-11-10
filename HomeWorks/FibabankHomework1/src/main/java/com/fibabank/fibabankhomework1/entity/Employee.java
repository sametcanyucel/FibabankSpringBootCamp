package com.fibabank.fibabankhomework1.entity;

public class Employee {
    private long employeeID;
    private String employeeName;
    private double monthlySalary;

    public Employee(){

    }
    public Employee(long employeeID, String employeeName, double monthlySalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.monthlySalary = monthlySalary;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
