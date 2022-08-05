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

    @GetMapping("/api/get/customers")
    public List<Customer> getAllCustomers(){
        return customerServices.getAllCustomerDetails();
    }

    @PostMapping("/api/add/customer")
    public String addCustomer(@RequestBody Customer customer){
        customerServices.addCustomer(customer);
        return customer.getCheckoutId();
    }

    @DeleteMapping("/api/delete/customer/{requestId}")
    public String deleteCustomer(@PathVariable String checkoutId){
        customerServices.deleteCustomer(checkoutId);
        return "Customer Deleted Successfully";
    }

}
