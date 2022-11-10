package com.fibabank.fibabankhomework2.Service;

import com.fibabank.fibabankhomework2.Entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(long customerId);
    List<Customer> findAllCustomer();
    void addNewCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(long customerId);

}
