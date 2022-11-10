package com.fibabank.fibabankhomework2.Controller;

import com.fibabank.fibabankhomework2.Entity.Customer;
import com.fibabank.fibabankhomework2.Service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerService;

    @GetMapping("/find/{id}")
    public Customer findCustomerById(@PathVariable("id") long customerId) {
        return customerService.findCustomerById(customerId);
    }

    @GetMapping("/find")
    public List<Customer> getAllCustomers() {

        return customerService.findAllCustomer();
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        customer.setCustomerId(8);
        customerService.addNewCustomer(customer);
        return customer;
    }

    @PutMapping("/customer")
    public void putCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable("id") long customerId) {
        customerService.deleteCustomer(customerId);
    }
}
