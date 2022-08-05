package com.onboarding_ass4.controllers;

import com.onboarding_ass4.model.Vehical;
import com.onboarding_ass4.services.VehicalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicalDetailsController {
    @Autowired
    public VehicalServices vehicalServices;

    @GetMapping("/api/get/vehicals")
    public List<Vehical> getAllDetails(){
        return vehicalServices.getAllVehicalDetails();
    }

    @PostMapping("/api/add/vehical")
    public String addVehical(@RequestBody Vehical vehical){
        vehicalServices.addVehical(vehical);
        return vehical.getRequestId();
    }

    @DeleteMapping("/api/delete/vehical/{requestId}")
    public String deleteVehical(@PathVariable String requestId){
        vehicalServices.deleteVehical(requestId);
        return "Vehical Deleted Successfully";
    }

    @PutMapping("/api/update/vehical/{requestId}")
    public Vehical updateVehical(@RequestBody Vehical vehical,@PathVariable String requestId){
        return vehicalServices.updateVehical(requestId,vehical);
    }
}
