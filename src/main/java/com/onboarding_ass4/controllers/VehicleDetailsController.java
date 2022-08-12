package com.onboarding_ass4.controllers;

import com.onboarding_ass4.model.Vehicle;
import com.onboarding_ass4.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleDetailsController {
    @Autowired
    public VehicleServices vehicleServices;

    //get all vehicles
    @GetMapping("/api/get/vehicles")
    public List<Vehicle> getAllDetails(){

        return vehicleServices.getAllVehicleDetails();
    }

    //add new vehicle
    @PostMapping("/api/add/vehicle")
    public String addVehicle(@RequestBody Vehicle vehicle){
        vehicleServices.addVehicle(vehicle);
        return vehicle.getRequestId();
    }

    //Get One Vehicle Details
    @GetMapping("/api/get/vehicle/{resultId}")
    public Vehicle getOneVehicle(@PathVariable String resultId){
        return vehicleServices.getOneVehicle(resultId);
    }

    //delete vehicle
    @DeleteMapping("/api/delete/vehicle/{resultId}")
    public String deleteVehicle(@PathVariable String resultId){
        vehicleServices.deleteVehicle(resultId);
        return "Vehicle Deleted Successfully";
    }

    //update vehicle
    @PutMapping("/api/update/vehicle/{resultId}")
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle, @PathVariable String resultId){
        return vehicleServices.updateVehicle(resultId, vehicle);
    }
}
