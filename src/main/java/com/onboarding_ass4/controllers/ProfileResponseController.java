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

    //Get Profile Details
    @GetMapping("/api/get/profile/{requestId}")
    public List<Profile> getOneProfile(@PathVariable String requestId){
        return profileServices.getOneProfile(requestId);
    }

}
