package com.onboarding_ass4.services;

import com.onboarding_ass4.model.Customer;
import com.onboarding_ass4.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServicesImpl implements CustomerServices{

    @Autowired
    public CustomerRepo customerRepo;

    @Override
    public String addCustomer(Customer customer) {
        Customer customer1 = customerRepo.save(customer);
        return customer1.getCheckoutId();
    }

    @Override
    public List<Customer> getAllCustomerDetails() {
        return customerRepo.findAll();
    }

    @Override
    public void deleteCustomer(String checkoutId) {
        List<Customer> customerList = customerRepo.findAll();
        for (int i = 0; i < customerList.size(); i++) {
            Customer customer1 = customerList.get(i);
            String temp_checkoutID = customer1.getCheckoutId();
            if (temp_checkoutID.equals(checkoutId)) {
                customerRepo.delete(customer1);
                break;
            }
        }
    }

}
