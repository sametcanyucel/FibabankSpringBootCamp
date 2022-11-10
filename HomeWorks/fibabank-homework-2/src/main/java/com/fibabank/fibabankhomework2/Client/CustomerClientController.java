package com.fibabank.fibabankhomework2.Client;

import com.fibabank.fibabankhomework2.Entity.Customer;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/customer")
public class CustomerClientController {

    @GetMapping("/find/{id}")
    public Customer findCustomerById(@PathVariable("id") long customerId) {
        RestTemplate restTemplate=new RestTemplate();
        String url="http://localhost:8080/api/find/"+customerId;
       Customer customer=restTemplate.getForObject(url,Customer.class);

       return customer;
    }

    @GetMapping("/find")
    public List<Customer> getAllCustomers() {

        RestTemplate restTemplate=new RestTemplate();
        String url="http://localhost:8080/api/find/";
        List<Customer>customers=restTemplate.getForObject(url,List.class);

        return customers;

    }

    @GetMapping("/add")
    public String addCustomer() {
        Customer customer=new Customer(0,"Samet",7800);
        String url="http://localhost:8080/api/customer";
        RestTemplate restTemplate=new RestTemplate();
        Customer result=restTemplate.postForObject(url,customer,Customer.class);
        return "Müşteri Eklendi "+result.getCustomerId();
    }

    @GetMapping("/put")
    public String putCustomer() {
        Customer customer=new Customer(0,"Samet",7800);
        String url="http://localhost:8080/api/customer";
        RestTemplate restTemplate=new RestTemplate();
        restTemplate.exchange(url,HttpMethod.PUT,new HttpEntity<Customer>(customer),Void.class);
        return "Müşteri Eklendi ";
    }

    @GetMapping("/delete/")
    public String deleteCustomer() {
        long customerId=4;
        String url="http://localhost:8080/api/customer/"+customerId;
        RestTemplate restTemplate=new RestTemplate();
        restTemplate.delete(url);
        return "Silme Başarılı";
    }
}
