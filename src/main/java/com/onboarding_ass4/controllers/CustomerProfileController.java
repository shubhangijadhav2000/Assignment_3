package com.onboarding_ass4.controllers;
import com.onboarding_ass4.model.Customer;
import com.onboarding_ass4.model.Vehical;
import com.onboarding_ass4.services.CustomerServices;
import com.onboarding_ass4.services.VehicalServices;
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

    @PutMapping("/api/get/customer/{checkoutId}")
    public Customer updateCustomer(@RequestBody Customer customer,@PathVariable String checkoutId){
        return customerServices.updateCustomer(checkoutId,customer);
    }

    @DeleteMapping("/api/delete/customer/{checkoutId}")
    public String deleteCustomer(@PathVariable String checkoutId){
        customerServices.deleteCustomer(checkoutId);
        return "Customer Deleted Successfully";
    }

}
