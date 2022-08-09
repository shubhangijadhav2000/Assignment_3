package com.onboarding_ass4.services;

import com.onboarding_ass4.model.Customer;
import com.onboarding_ass4.model.Vehicle;
import com.onboarding_ass4.repos.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class VehicleServicesImpl implements VehicleServices{

    @Autowired
    public VehicleRepo vehicleRepo;

    @Override
    public String addVehicle(Vehicle vehicle){
        Vehicle vehicle1=vehicleRepo.save(vehicle);
        return vehicle1.getRequestId();
    }

    @Override
    public List<Vehicle> getAllVehicleDetails(){
        List<Vehicle> vehicleList=vehicleRepo.findAll();
        return vehicleList;
    }

    @Override
    public Vehicle getOneVehicle(String requestId) {
        return vehicleRepo.findVehicleById(requestId);
    }

    @Override
    public void deleteVehicle(String requestId){

        Vehicle vehicle=vehicleRepo.findVehicleById(requestId);
        vehicleRepo.delete(vehicle);
    }

    @Override
    public Vehicle updateVehicle(String requestId,Vehicle vehicle) {

        Vehicle vehicle1=vehicleRepo.findVehicleById(requestId);
        //update requestId
        if(Objects.nonNull(vehicle.getRequestId())&&"".equalsIgnoreCase(vehicle.getRequestId())){
            vehicle1.setRequestId(vehicle.getRequestId());
        }
        //update Vertical
        if(Objects.nonNull(vehicle.getVertical())&&"".equalsIgnoreCase(vehicle.getVertical())){
            vehicle1.setVertical(vehicle.getVertical());
        }
        //update Insurer_name
        if(Objects.nonNull(vehicle.getInsurer_name())&&"".equalsIgnoreCase(vehicle.getInsurer_name())){
            vehicle1.setInsurer_name(vehicle.getInsurer_name());
        }
        //update Make
        if(Objects.nonNull(vehicle.getMake())&&"".equalsIgnoreCase(vehicle.getMake())){
            vehicle1.setMake(vehicle.getMake());
        }
        //Update Model
        if(Objects.nonNull(vehicle.getModel())&&"".equalsIgnoreCase(vehicle.getModel())){
            vehicle1.setModel(vehicle.getModel());
        }
        //update Premium
        if(Objects.nonNull(vehicle.getPremium())&&"".equalsIgnoreCase(vehicle.getPremium())) {
            vehicle1.setPremium(vehicle.getPremium());
        }
        return vehicle1;
    }


}