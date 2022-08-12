package com.onboarding_ass4.repos;

import com.onboarding_ass4.model.Quotation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuotationRepo extends MongoRepository<Quotation,String> {

    //--------custom query methods--------//

    @Query("{requestId:?0}")
    Quotation findQuotationById(String requestId);

    @Query("{vertical:?0}")
    Quotation findQuotationByVertical(String vertical);

    @Query("{make:?0}")
    Quotation findQuotationByMake(String make);

    @Query("{model:?0}")
    Quotation findQuotationByModel(String model);

    //    @Query("{insurer_name:?0}")
//    Quotation findVehicleByInsurerName(String in);
//
//    @Query("{premium:?0}")
//    Quotation findVehicleByPremium(String premium);
//
    @Query("{make:?0,model:?1}")
    List<Quotation> findAllQuotationByMakeAndModel(@Param("Make") String Make, @Param("Model") String Model);


}
