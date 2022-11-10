package com.fibabank.fibabankhomework2.Service;

import com.fibabank.fibabankhomework2.Entity.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public Customer findCustomerById(long customerId) {
        Customer customer=new Customer(customerId,"Samet",5750);
        System.out.println("Müşteri İstendi ");
        return customer;
    }

    @Override
    public List<Customer> findAllCustomer() {
        List<Customer>customers=new ArrayList<>();
        customers.add(new Customer(1,"Samet",5750));
        customers.add(new Customer(2,"Ahmet",6750));
        customers.add(new Customer(3,"Mehmet",7750));
        customers.add(new Customer(4,"Demet",8800));
        customers.add(new Customer(5,"Buket",9900));

        return customers;
    }

    @Override
    public void addNewCustomer(Customer customer) {
        System.out.println("Yeni Kullanıcı Eklendi Id :"+customer.getCustomerId()+" "+customer.getCustomerName()+" "+customer.getTotalDebit());

    }

    @Override
    public void updateCustomer(Customer customer) {
        System.out.println("Kullanıcı Güncellendi Id :"+customer.getCustomerId()+" "+customer.getCustomerName()+" "+customer.getTotalDebit());
    }

    @Override
    public void deleteCustomer(long customerId) {
        System.out.println("Kullanıcı Silindi "+customerId);
    }
}
