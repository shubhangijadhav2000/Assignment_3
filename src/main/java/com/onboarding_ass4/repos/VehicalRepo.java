package com.onboarding_ass4.repos;

import com.onboarding_ass4.model.Customer;
import com.onboarding_ass4.model.Vehical;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface VehicalRepo extends MongoRepository<Vehical,Integer> {

    //--------custom query methods--------//

    @Query("{requestId:?0}")
    Vehical findVehicalById(String requestId);

    @Query("{vertical:?0}")
    Vehical findVehicalByVertical(String vertical);

    @Query("{make:?0}")
    Vehical findVehicalByMake(String make);

    @Query("{insurer_name:?0}")
    Vehical findVehicalByInsurerName(String insurer_name);

    @Query("{premium:?0}")
    Vehical findVehicalByPremium(String premium);

}
