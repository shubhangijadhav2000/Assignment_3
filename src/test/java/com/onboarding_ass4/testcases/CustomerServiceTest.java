package com.onboarding_ass4.testcases;

import com.onboarding_ass4.model.Customer;
import com.onboarding_ass4.repos.CustomerRepo;
import com.onboarding_ass4.services.CustomerServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    public CustomerServices customerServices;
    @MockBean
    public CustomerRepo customerRepo;

    //Junit test case for getting all Customer details
    @Test
    public void getAllCustomerDetailsTest(){
        when(customerRepo.findAll()).thenReturn(Stream.of(new Customer("1500","Shubham Parkhe",
                        "shubhamp@gmail.com","9898987666","AAAAAAA","BBBBBB"),
                new Customer("1600","Sachin Parkhe","sachinp@gmail.com",
                        "9898987555","CCCCCC","DDDDDD")).collect(Collectors.toList()));
        assertEquals(2,customerServices.getAllCustomerDetails().size());
    }

    //Junit test case for adding customer details
    @Test
    public void addCustomerTest(){
        Customer customer=new Customer("1500","Shubham Parkhe",
                "shubhamp@gmail.com","9898987666","AAAAAAA","BBBBBB");
        when(customerRepo.save(customer)).thenReturn(customer);
        assertEquals(customerServices.addCustomer(customer),customer.getCheckoutId());
    }

    //Junit test case for getting one Customer details by checkoutId
    @Test
    public void getOneCustomer(){
        Customer customer1 = new Customer("1500","Shubham Parkhe",
                        "shubhamp@gmail.com","9898987666","AAAAAAA","BBBBBB");
        Customer customer2 = new Customer("1600","Sachin Parkhe",
                "sachinp@gmail.com","9898987555","CCCCCC","DDDDDD");
        when(customerRepo.findCustomerById("1500")).thenReturn(customer1);
        assertEquals(customer1,customerServices.getOneCustomer("1500"));
    }

    //Junit Test case for deleting customer by checkoutId
    @Test
    public void deleteCustomerTest(){
        Customer customer = new Customer("1500","Shubham Parkhe",
                "shubhamp@gmail.com","9898987666","AAAAAAA","BBBBBB");
        customerServices.deleteCustomer("1500");
        verify(customerRepo,times(1)).delete(customerRepo.findCustomerById("1500"));
    }

    //Junit Test case for updating customer details by checkoutId
    @Test
    public void updateCustomer(){
        Customer customer1 = new Customer("1500","Shubham Parkhe",
                "shubhamp@gmail.com","9898987666","AAAAAAA","BBBBBB");
        Customer customer2 = new Customer("1600","Sachin Parkhe",
                "sachinp@gmail.com","9898987555","CCCCCC","DDDDDD");
        customerServices.updateCustomer("1500",customer1);
        when(customerServices.updateCustomer("1500",customer2)).thenReturn(customer2);
        assertEquals(customer2,customerServices.getOneCustomer("1500"));
    }

}