package com.onboarding_ass4.services;

import com.onboarding_ass4.model.Profile;
import com.onboarding_ass4.model.Quotation;
import com.onboarding_ass4.model.Vehicle;
import com.onboarding_ass4.repos.ProfileRepo;
import com.onboarding_ass4.repos.QuotationRepo;
import com.onboarding_ass4.repos.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ProfileServicesImpl implements ProfileServices {

    @Autowired
    private ProfileRepo profileRepo;
    @Autowired
    private VehicleRepo vehicleRepo;
    @Autowired
    private QuotationServicesImpl quotationServicesImpl;
    @Autowired
    private QuotationRepo quotationRepo;

    @Override
    public void addProfile(String requestId) {
        Vehicle vehicle = vehicleRepo.findByRequestId(requestId);
        String make1 = vehicle.getMake();
        String model1 = vehicle.getModel();
        List<Quotation> quotationList =
                new ArrayList<>(quotationRepo.findAllQuotationByMakeAndModel(make1, model1));

        //Save All  responses for all the insurers
        for (int i = 0; i < quotationList.size(); i++) {
            Profile profile = new Profile();
            //set requestId of quotation
            profile.setRequestId(requestId);
            //set supported insurers in the response
            profile.setSupportedInsurers(quotationList.get(i).getSupportedInsurers());
            //save resultId of the vehicle in the response
            profile.setResultId(quotationList.get(i).getRequestId());
            profileRepo.save(profile);
        }
    }

//    List<Profile> getAllProfileDetails();
//
    @Override
    public List<Profile> getOneProfile(String requestId){
        return profileRepo.findAllProfileByRequestId(requestId);
    }
//
//    void deleteProfile(String resultId);
//
//    Profile updateProfile(String resultId, Profile profile);
}
