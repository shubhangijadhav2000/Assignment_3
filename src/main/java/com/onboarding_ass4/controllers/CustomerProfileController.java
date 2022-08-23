package com.onboarding_ass4.controllers;
import com.onboarding_ass4.model.Customer;
import com.onboarding_ass4.model.Profile;
import com.onboarding_ass4.model.Vehicle;
import com.onboarding_ass4.repos.ProfileRepo;
import com.onboarding_ass4.repos.VehicleRepo;
import com.onboarding_ass4.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

@RestController
public class CustomerProfileController {

    @Autowired
    public CustomerServices customerServices;
    @Autowired
    public VehicleRepo vehicleRepo;
    @Autowired
    public ProfileRepo profileRepo;

    //Get All Customer details
    @GetMapping("/api/get/customers")
    public List<Customer> getAllCustomers(){

        return customerServices.getAllCustomerDetails();
    }

    //Get One customer Details
    @GetMapping("/api/get/customer/{checkoutId}")
    public Map<String,Object> getOneCustomer(@PathVariable String checkoutId){
        Customer customer1= customerServices.getOneCustomer(checkoutId);
        Map<String,Object> response= new HashMap<String,Object>();

        String resultId= customer1.getResultId();
        String reqId= customer1.getRequestId();
        Profile profile=profileRepo.findByResultIdAndRequestId(resultId,reqId);
        Vehicle vehicle=vehicleRepo.findByRequestId(reqId);

        response.put("customer", customer1);
        response.put("profile", profile);
        response.put("vehicle",vehicle);
        return response;
    }

    //Add new customer checkout
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
