package com.onboarding_ass4.repos;

import com.onboarding_ass4.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface VehicleRepo extends MongoRepository<Vehicle,Integer> {
    //--------custom query methods--------//

    @Query("{requestId:?0}")
    Vehicle findVehicleById(String requestId);

    @Query("{vertical:?0}")
    Vehicle findVehicleByVertical(String vertical);

    @Query("{make:?0}")
    Vehicle findVehicleByMake(String make);

    @Query("{insurer_name:?0}")
    Vehicle findVehicleByInsurerName(String insurer_name);

    @Query("{premium:?0}")
    Vehicle findVehicleByPremium(String premium);
}