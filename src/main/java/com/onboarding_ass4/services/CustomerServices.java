package com.onboarding_ass4.services;

import com.onboarding_ass4.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerServices {
    String addCustomer(Customer customer);

    List<Customer> getAllCustomerDetails();

    void deleteCustomer(String checkoutId);

    Customer getOneCustomer(String checkoutId);

    Customer updateCustomer(String checkoutId, Customer customer);

}
