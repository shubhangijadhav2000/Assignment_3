package com.onboarding_ass4.services;

import com.onboarding_ass4.model.Vehicle;
import com.onboarding_ass4.repos.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class VehicleServicesImpl implements VehicleServices {

    @Autowired
    public VehicleRepo vehicleRepo;
    @Autowired
    private QuotationServicesImpl quotationServicesImpl;
    @Autowired
    private ProfileServices profileServices;

    @Override
    public String addVehicle(Vehicle vehicle) {
        String Id;
        while (true) {
            Id = quotationServicesImpl.createRequestId();
            if (vehicleRepo.findByRequestId(Id) == null) {
                break;
            }
        }
        vehicle.setRequestId(Id);
        Vehicle vehicle1 = vehicleRepo.save(vehicle);
        profileServices.addProfile(Id);
        return vehicle1.getRequestId();
    }

    @Override
    public List<Vehicle> getAllVehicleDetails() {
        List<Vehicle> vehicleList = vehicleRepo.findAll();
        return vehicleList;
    }

    @Override
    public Vehicle getOneVehicle(String requestId) {

        return vehicleRepo.findByRequestId(requestId);
    }

    @Override
    public void deleteVehicle(String requestId) {

        Vehicle vehicle = vehicleRepo.findByRequestId(requestId);
        vehicleRepo.delete(vehicle);
    }

    @Override
    public Vehicle updateVehicle(String requestId, Vehicle vehicle) {

        Vehicle vehicle1 = vehicleRepo.findByRequestId(requestId);
        //update requestId
        if (Objects.nonNull(vehicle.getRequestId()) && "".equalsIgnoreCase(vehicle.getRequestId())) {
            vehicle1.setRequestId(vehicle.getRequestId());
        }
        //update Vertical
        if (Objects.nonNull(vehicle.getVertical()) && "".equalsIgnoreCase(vehicle.getVertical())) {
            vehicle1.setVertical(vehicle.getVertical());
        }

        //update Make
        if (Objects.nonNull(vehicle.getMake()) && "".equalsIgnoreCase(vehicle.getMake())) {
            vehicle1.setMake(vehicle.getMake());
        }
        //Update Model
        if (Objects.nonNull(vehicle.getModel()) && "".equalsIgnoreCase(vehicle.getModel())) {
            vehicle1.setModel(vehicle.getModel());
        }

        return vehicle1;
    }
}