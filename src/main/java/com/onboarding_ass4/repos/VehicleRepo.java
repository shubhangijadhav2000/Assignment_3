package com.onboarding_ass4.repos;

import com.onboarding_ass4.model.Quotation;
import com.onboarding_ass4.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface VehicleRepo extends MongoRepository<Vehicle,Integer> {

    //--------custom query methods--------//

    @Query("{requestId:?0}")
    Vehicle findByRequestId(String requestId);

    @Query("{vertical:?0}")
    Vehicle findVehicleByVertical(String vertical);

    @Query("{make:?0}")
    Vehicle findVehicleByMake(String make);

    @Query("{model:?0}")
    Vehicle findVehicleByModel(String model);

    @Query("{make:?0,model:?1}")
    Vehicle findVehicleByMakeAndModel(String make, String model);
}
