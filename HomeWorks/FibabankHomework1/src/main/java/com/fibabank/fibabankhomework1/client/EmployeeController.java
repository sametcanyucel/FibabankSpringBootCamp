package com.fibabank.fibabankhomework1.client;

import com.fibabank.fibabankhomework1.entity.Employee;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@ResponseBody
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping("/get")
    public String getEmployee() {
        long employeeID = 4;
        String url = "http://localhost:8080/api/employee/" + employeeID;
        RestTemplate restTemplate = new RestTemplate();
        Employee employee = restTemplate.getForObject(url, Employee.class);

        return "Çalışan başarıyla getirildi :" + employee.getEmployeeName()+" ID:"+employee.getEmployeeID();
    }

    @GetMapping("/post")
    public String postEmployee() {
        Employee employee = new Employee(0, "Can Aksoy", 4750);
        String url = "http://localhost:8080/api/employee";
        RestTemplate restTemplate = new RestTemplate();
        Employee resultEmployee = restTemplate.postForObject(url, employee, Employee.class);

        return "Çalışan başarıyla eklendi " + resultEmployee.getEmployeeName()+" ID:"+resultEmployee.getEmployeeID();
    }

    @GetMapping("/put")
    public String putEmployee() {
        Employee employee = new Employee(15, "Can Aksoy", 5000);
        String url = "http://localhost:8080/api/employee";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.exchange(url, HttpMethod.PUT, new HttpEntity<>(employee), Void.class);
        return "Çalışan güncelleme başarılı " + employee.getEmployeeName();
    }

    @GetMapping("/delete")
    public String deleteEmployee() {
        long employeeID = 15;
        String url = "http://localhost:8080/api/employee/" + employeeID;
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(url);
        return "Çalışan başarıyla silindi  ID: " + employeeID;
    }

}
