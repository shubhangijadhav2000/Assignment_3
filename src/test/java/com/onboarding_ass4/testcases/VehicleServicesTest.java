package com.onboarding_ass4.testcases;

import com.onboarding_ass4.model.Quotation;
import com.onboarding_ass4.model.SupportedInsurers;
import com.onboarding_ass4.model.Vehicle;
import com.onboarding_ass4.repos.VehicleRepo;
import com.onboarding_ass4.services.VehicleServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class VehicleServicesTest {

//    @Autowired
//    public VehicleServices vehicleServices;
//
//    @MockBean
//    public VehicleRepo vehicleRepo;
//
//    //Junit test case for getting all vehicles details
//    @Test
//    public void getAllVehicleDetailsTest(){
//        when(vehicleRepo.findAll()).thenReturn(Stream.of(new Vehicle("AAAAAAA","TW",
//                        "bajaj","pulsar"),
//                new Vehicle("BBBBBBB","FW","hundai",
//                        "i10")).collect(Collectors.toList()));
//        assertEquals(2,vehicleServices.getAllVehicleDetails().size());
//    }
//
//    //Junit test case for adding new vehicle details
//    @Test
//    public void addVehicleTest(){
//        Vehicle vehicle =new Vehicle("AAAAAAA","TW",
//                "bajaj","pulsar");
//        when(vehicleRepo.save(vehicle)).thenReturn(vehicle);
//        assertEquals(vehicleServices.addVehicle(vehicle), vehicle.getRequestId());
//    }
//
//    //Junit test case for getting one Quotation details by requestId
//    @Test
//    public void getOneVehicleTest(){
//
//        Vehicle vehicle1 = new Vehicle("AAAAAAA","TW",
//                "bajaj","pulsar");
//        Vehicle vehicle2 =new Vehicle("BBBBBBB","FW","hundai",
//                "i10");
//        when(vehicleRepo.findVehicleById("BBBBBBB")).thenReturn(vehicle2);
//        assertEquals(vehicle2,vehicleServices.getOneVehicle("BBBBBBB"));
//    }
//
//    //Junit test case for deleting vehicle by requestId
//    @Test
//    public void deleteVehicleTest(){
//
//        Vehicle vehicle =new Vehicle("AAAAAAA","TW",
//                "bajaj","pulsar");
//        vehicleServices.deleteVehicle("AAAAAAA");
//        verify(vehicleRepo,times(1)).delete(vehicleRepo.findVehicleById("AAAAAAA"));
//    }
//
//    //Junit Test case for updating vehicle details by requestId
//    @Test
//    public void updateVehicleTest(){
//
//        Vehicle vehicle1 = new Vehicle("AAAAAAA","TW",
//                "bajaj","pulsar");
//        Vehicle vehicle2 =new Vehicle("BBBBBBB","FW","hundai",
//                "i10");
//        vehicleServices.updateVehicle("AAAAAAA", vehicle1);
//        when(vehicleServices.updateVehicle("AAAAAAA", vehicle2)).thenReturn(vehicle2);
//        assertEquals(vehicle2,vehicleServices.getOneVehicle("AAAAAAA"));
//    }
}
