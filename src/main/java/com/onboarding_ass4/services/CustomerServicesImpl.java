package com.onboarding_ass4.services;

import com.onboarding_ass4.model.Customer;
import com.onboarding_ass4.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerServicesImpl implements CustomerServices{

    @Autowired
    public CustomerRepo customerRepo;

    //Add new Customer
    @Override
    public String addCustomer(Customer customer) {
        Customer customer1 = customerRepo.save(customer);
        return customer1.getCheckoutId();
    }

    //Get All Customer Details
    @Override
    public List<Customer> getAllCustomerDetails() {
        return customerRepo.findAll();
    }

    //Get One Customer Details
    @Override
    public Customer getOneCustomer(String checkoutId) {
        return customerRepo.findCustomerById(checkoutId);
    }

    //Update customer by Id
    @Override
    public Customer updateCustomer(String checkoutId, Customer customer){
        //find customer details by checkoutId
        Customer customer1=customerRepo.findCustomerById(checkoutId);

        //update checkout
        if(Objects.nonNull(customer.getCheckoutId())&&"".equalsIgnoreCase(customer.getCheckoutId())){
            customer1.setCheckoutId(customer.getCheckoutId());
        }
        //update Customer name
        if(Objects.nonNull(customer.getCustomerName())&&"".equalsIgnoreCase(customer.getCustomerName())){
            customer1.setCustomerName(customer.getCustomerName());
        }
        //update Customer Email
        if(Objects.nonNull(customer.getCustomerEmail())&&"".equalsIgnoreCase(customer.getCustomerEmail())){
            customer1.setCustomerEmail(customer.getCustomerEmail());
        }
        //update Customer Phone Number
        if(Objects.nonNull(customer.getCustomerPhone())&&"".equalsIgnoreCase(customer.getCustomerPhone())){
            customer1.setCustomerPhone(customer.getCustomerPhone());
        }
        //update requestId
        if(Objects.nonNull(customer.getRequestId())&&"".equalsIgnoreCase(customer.getRequestId())){
            customer1.setRequestId(customer.getRequestId());
        }

        return customer1;
    }

    //Delete Customer using Id
    public void deleteCustomer(String checkoutId) {

        Customer customer=customerRepo.findCustomerById(checkoutId);
        customerRepo.delete(customer);
    }

}
