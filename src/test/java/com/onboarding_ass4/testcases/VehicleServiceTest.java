package com.onboarding_ass4.testcases;

import com.onboarding_ass4.model.Customer;
import com.onboarding_ass4.model.Vehicle;
import com.onboarding_ass4.repos.VehicleRepo;
import com.onboarding_ass4.services.VehicleServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class VehicleServiceTest {

    @Autowired
    public VehicleServices vehicleServices;

    @MockBean
    public VehicleRepo vehicleRepo;

    //Junit test case for getting all vehicles details
    @Test
    public void getAllVehicleDetailsTest(){
        when(vehicleRepo.findAll()).thenReturn(Stream.of(new Vehicle("AAAAAAA","TW",
                        "bajaj","pulsar","DIGIT","1900"),
                new Vehicle("BBBBBBB","FW","hundai",
                        "i10","CHOL","6000")).collect(Collectors.toList()));
        assertEquals(2,vehicleServices.getAllVehicleDetails().size());
    }

    //Junit test case for adding new vehicle details
    @Test
    public void addVehicleTest(){
        Vehicle vehicle=new Vehicle("AAAAAAA","TW",
                "bajaj","pulsar","DIGIT","1900");
        when(vehicleRepo.save(vehicle)).thenReturn(vehicle);
        assertEquals(vehicleServices.addVehicle(vehicle),vehicle.getRequestId());
    }

    //Junit test case for getting one Vehicle details by requestId
    @Test
    public void getOneCustomerTest(){
        Vehicle vehicle1 = new Vehicle("AAAAAAA","TW",
                                         "bajaj","pulsar","DIGIT","1900");
        Vehicle vehicle2 =new Vehicle("BBBBBBB","FW","hundai",
                                          "i10","CHOL","6000");
       when(vehicleRepo.findVehicleById("BBBBBBB")).thenReturn(vehicle2);
       assertEquals(vehicle2,vehicleServices.getOneVehicle("BBBBBBB"));
    }

    //Junit test case for deleting vehicle by requestId
    @Test
    public void deleteVehicleTest(){
        Vehicle vehicle=new Vehicle("AAAAAAA","TW",
                "bajaj","pulsar","DIGIT","1900");
        vehicleServices.deleteVehicle("AAAAAAA");
        verify(vehicleRepo,times(1)).delete(vehicleRepo.findVehicleById("AAAAAAA"));
    }

    //Junit Test case for updating vehicle details by requestId
    @Test
    public void updateVehicle(){
        Vehicle vehicle1 = new Vehicle("AAAAAAA","TW",
                "bajaj","pulsar","DIGIT","1900");
        Vehicle vehicle2 =new Vehicle("BBBBBBB","FW","hundai",
                "i10","CHOL","6000");
        vehicleServices.updateVehicle("AAAAAAA",vehicle1);
        when(vehicleServices.updateVehicle("AAAAAAA",vehicle2)).thenReturn(vehicle2);
        assertEquals(vehicle2,vehicleServices.getOneVehicle("AAAAAAA"));
    }
}