package com.onboarding_ass4.services;

import com.onboarding_ass4.model.Customer;

import java.util.List;


public interface CustomerServices {
    String addCustomer(Customer customer);

    List<Customer> getAllCustomerDetails();

    void deleteCustomer(String checkoutId);

    Customer getOneCustomer(String checkoutId);

    Customer updateCustomer(String checkoutId, Customer customer);

}
