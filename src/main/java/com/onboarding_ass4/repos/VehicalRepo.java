package com.onboarding_ass4.repos;

import com.onboarding_ass4.model.Vehical;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicalRepo extends MongoRepository<Vehical,Integer> {
}
