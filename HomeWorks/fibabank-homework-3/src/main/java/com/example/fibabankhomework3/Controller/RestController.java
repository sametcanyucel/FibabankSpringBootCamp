package com.example.fibabankhomework3.Controller;

import com.example.fibabankhomework3.Entity.Department;
import com.example.fibabankhomework3.Entity.Employee;
import com.example.fibabankhomework3.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    @Autowired
    DepartmentRepository departmentRepository;
    @GetMapping("/add")
    public void addDepartment(@RequestBody Department department)
    {
        departmentRepository.save(department);

    }
    @GetMapping("/find/{id}")
    public String getListById(@PathVariable("id")long teamId){
        List<Employee> players=departmentRepository.findAllByTeamID(teamId);
        for (Employee player:players) {
            System.out.println(player.getEmployeeId()+" "+player.getEmployeeName());
        }

        return "";
    }

}
