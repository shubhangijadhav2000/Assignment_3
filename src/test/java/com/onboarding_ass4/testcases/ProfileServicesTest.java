package com.onboarding_ass4.testcases;

import com.onboarding_ass4.model.Profile;
import com.onboarding_ass4.model.SupportedInsurers;
import com.onboarding_ass4.repos.ProfileRepo;
import com.onboarding_ass4.services.ProfileServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProfileServicesTest {
    @Autowired
    public ProfileServices profileServices;
    @MockBean
    public ProfileRepo profileRepo;


    @Test
    public void getOneProfileTest(){
        Profile profile1= new Profile("ABC",new SupportedInsurers("HDFC",1000),"XYZ");
        Profile profile2= new Profile("ABC",new SupportedInsurers("ICICI",1200),"UVW");
        when(profileRepo.findAllProfileByRequestId("ABC")).thenReturn((List<Profile>) Stream.of(profile1,profile2).collect(Collectors.toList()));
        assertEquals(2,profileServices.getOneProfile("ABC").size());
    }
}
