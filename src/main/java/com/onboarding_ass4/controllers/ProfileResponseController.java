package com.onboarding_ass4.controllers;

import com.onboarding_ass4.model.Profile;
import com.onboarding_ass4.model.Vehicle;
import com.onboarding_ass4.services.ProfileServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileResponseController {

    @Autowired
    public ProfileServices profileServices;

    //add new Profiles
//    @PostMapping("/api/add/profiles/{requestId}")
//    public List<Profile> addVehicle(@PathVariable String requestId){
//        return profileServices.addProfile(requestId);
//    }

    //Get One Profile Details
    @GetMapping("/api/get/profile/{requestId}")
    public List<Profile> getOneProfile(@PathVariable String requestId){

        return profileServices.getOneProfile(requestId);
    }

}
