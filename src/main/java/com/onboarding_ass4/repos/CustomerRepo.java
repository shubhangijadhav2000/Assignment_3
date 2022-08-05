package com.onboarding_ass4.repos;

import com.onboarding_ass4.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CustomerRepo extends MongoRepository<Customer,Integer>{

}
