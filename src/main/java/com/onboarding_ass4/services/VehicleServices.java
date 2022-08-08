package com.onboarding_ass4.services;

import com.onboarding_ass4.model.Vehicle;

import java.util.List;

public interface VehicleServices {
    String addVehicle(Vehicle vehicle);

    List<Vehicle> getAllVehicleDetails();

    void deleteVehicle(String requestId);

    Vehicle updateVehicle(String requestId,Vehicle vehicle);
}
