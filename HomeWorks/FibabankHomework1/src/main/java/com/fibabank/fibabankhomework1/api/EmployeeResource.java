package com.fibabank.fibabankhomework1.api;

import com.fibabank.fibabankhomework1.entity.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeResource {
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") long employeeID) {
        Employee employee = new Employee(employeeID, "Samet Can Yücel", 5000);
        return employee;
    }

    @PostMapping("/employee")
    public Employee postEmloyee(@RequestBody Employee employee) {
        employee.setEmployeeID(10);

        System.out.println("Yeni Çalışan Eklendi " + employee.getEmployeeID() + " "
                + employee.getEmployeeName() + " " + employee.getMonthlySalary());

        return employee;
    }

    @PutMapping("/employee")
    public void putEmplooye(@RequestBody Employee employee) {
        System.out.println("Çalışan güncelleme başarılı." + employee.getEmployeeID() + " "
                + employee.getEmployeeName() + " " + employee.getMonthlySalary());
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") long employeeID) {
        System.out.println("Çalışan silindi " + employeeID);
    }
}
