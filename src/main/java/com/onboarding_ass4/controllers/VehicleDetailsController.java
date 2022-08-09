package com.onboarding_ass4.controllers;

import com.onboarding_ass4.model.Customer;
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
    @GetMapping("/api/get/vehicle/{requestId}")
    public Vehicle getOneVehicle(@PathVariable String requestId){
        return vehicleServices.getOneVehicle(requestId);
    }

    //delete vehicle
    @DeleteMapping("/api/delete/vehicle/{requestId}")
    public String deleteVehicle(@PathVariable String requestId){
        vehicleServices.deleteVehicle(requestId);
        return "Vehicle Deleted Successfully";
    }

    //update vehicle
    @PutMapping("/api/update/vehicle/{requestId}")
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle,@PathVariable String requestId){
        return vehicleServices.updateVehicle(requestId,vehicle);
    }
}
