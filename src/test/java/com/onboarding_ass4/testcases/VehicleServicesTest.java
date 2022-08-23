package com.onboarding_ass4.testcases;

import com.onboarding_ass4.model.Quotation;
import com.onboarding_ass4.model.SupportedInsurers;
import com.onboarding_ass4.model.Vehicle;
import com.onboarding_ass4.repos.VehicleRepo;
import com.onboarding_ass4.services.ProfileServices;
import com.onboarding_ass4.services.VehicleServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

@SpringBootTest
public class VehicleServicesTest {

    @Autowired
    public VehicleServices vehicleServices;
    @Autowired
    public ProfileServices profileServicesTest;

    @MockBean
    public VehicleRepo vehicleRepo;

    //Junit test case for getting all vehicles details
    @Test
    public void getAllVehicleDetailsTest(){
        when(vehicleRepo.findAll()).thenReturn(Stream.of(new Vehicle("AAAAAAA","TW",
                        "bajaj","pulsar"),
                new Vehicle("BBBBBBB","FW","hundai",
                        "i10")).collect(Collectors.toList()));
        assertEquals(2,vehicleServices.getAllVehicleDetails().size());
    }

    //Junit test case for adding new vehicle details
//    @Test
//    public void addVehicleTest(){
//        Vehicle vehicle =new Vehicle("AAAAAAA","TW",
//                "bajaj","pulsar");
//        String reqId=vehicleServices.addVehicle(vehicle);
//        vehicle.setRequestId(reqId);
//        assertEquals(vehicle,vehicleRepo.findByRequestId(reqId));
//
//    }


}
