package com.onboarding_ass4.services;

import com.onboarding_ass4.model.Vehical;

import java.util.List;

public interface VehicalServices {
    String addVehical(Vehical vehical);

    List<Vehical> getAllVehicalDetails();

    void deleteVehical(String requestId);



}
