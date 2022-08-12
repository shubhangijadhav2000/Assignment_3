package com.onboarding_ass4.services;

import com.onboarding_ass4.model.Profile;
import com.onboarding_ass4.model.Quotation;
import com.onboarding_ass4.model.Vehicle;

import java.util.List;

public interface ProfileServices {

     void addProfile(String requestId);
//
//    List<Profile> getAllProfileDetails();
//
    List<Profile> getOneProfile(String requestId);
//
//    void deleteProfile(String resultId);
//
//    Profile updateProfile(String resultId, Profile profile);
}
