package com.example.fibabankhomework3.Entity;

import javax.persistence.*;
import java.util.List;
@Entity
public class Department {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long departmentId;
    private String deparmentName;
    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Employee> employeeList;

    public Department() {
    }

    public Department(long departmentId, String deparmentName, List<Employee> employeeList) {
        this.departmentId = departmentId;
        this.deparmentName = deparmentName;
        this.employeeList = employeeList;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDeparmentName() {
        return deparmentName;
    }

    public void setDeparmentName(String deparmentName) {
        this.deparmentName = deparmentName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
