package com.onboarding_ass4.controllers;
import com.onboarding_ass4.model.Customer;
import com.onboarding_ass4.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerProfileController {

    @Autowired
    public CustomerServices customerServices;

    //Get All Customer details
    @GetMapping("/api/get/customers")
    public List<Customer> getAllCustomers(){
        return customerServices.getAllCustomerDetails();
    }

    //Get One customer Details
    @GetMapping("/api/get/customer/{checkoutId}")
    public Customer getOneCustomer(@PathVariable String checkoutId){
        return customerServices.getOneCustomer(checkoutId);
    }

    //Add new customer
    @PostMapping("/api/add/customer")
    public String addCustomer(@RequestBody Customer customer){
        customerServices.addCustomer(customer);
        return customer.getCheckoutId();
    }

    // Get customer by customer id
    @PutMapping("/api/get/customer/{checkoutId}")
    public Customer updateCustomer(@RequestBody Customer customer,@PathVariable String checkoutId){
        return customerServices.updateCustomer(checkoutId,customer);
    }

    //delete customer by customer id
    @DeleteMapping("/api/delete/customer/{checkoutId}")
    public String deleteCustomer(@PathVariable String checkoutId){
        customerServices.deleteCustomer(checkoutId);
        return "Customer Deleted Successfully";
    }

}
