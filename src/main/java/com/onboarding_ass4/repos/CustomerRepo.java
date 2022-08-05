package com.onboarding_ass4.repos;

import com.onboarding_ass4.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface CustomerRepo extends MongoRepository<Customer,Integer>{

    //---------custom query methods---------//

    @Query("{checkoutId:?0}")
    Customer findCustomerById(String checkoutId);

    @Query("{customerName:?0}")
    Customer findCustomerByName(String customerName);

    @Query("{customerEmail:?0}")
    Customer findCustomerByEmail(String customerEmail);

    @Query("{customerPhone:?0}")
    Customer findCustomerByPhone(String customerPhone);

    @Query("{requestId:?0}")
    Customer findCustomerByReqId(String requestId);

}
