package com.onboarding_ass4.testcases;
import com.onboarding_ass4.model.Quotation;
import com.onboarding_ass4.model.SupportedInsurers;
import com.onboarding_ass4.model.Vehicle;
import com.onboarding_ass4.repos.QuotationRepo;
import com.onboarding_ass4.repos.VehicleRepo;
import com.onboarding_ass4.services.QuotationServices;
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
public class QuotationServiceTest {

//    @Autowired
//    public QuotationServices quotationServices;
//
//    @MockBean
//    public QuotationRepo quotationRepo;
//
//    //Junit test case for getting all quotation details
//    @Test
//    public void getAllQuotationDetailsTest(){
//        List<SupportedInsurers> insurers = new ArrayList<SupportedInsurers>();
//        insurers.add(new SupportedInsurers("Digit",9000));
//        insurers.add(new SupportedInsurers("CHOL",8000));
//
//        when(quotationRepo.findAll()).thenReturn(Stream.of(new Quotation("AAAAAAA","TW",
//                        "bajaj","pulsar", insurers),
//                new Quotation("BBBBBBB","FW","hundai",
//                        "i10",insurers)).collect(Collectors.toList()));
//        assertEquals(2,quotationServices.getAllQuotationDetails().size());
//    }
//
//    //Junit test case for adding new Quotation details
//    @Test
//    public void addQuotationTest(){
//        List<SupportedInsurers> insurers = new ArrayList<SupportedInsurers>();
//        insurers.add(new SupportedInsurers("Digit",9000));
//        insurers.add(new SupportedInsurers("CHOL",8000));
//        Quotation quotation =new Quotation("AAAAAAA","TW",
//                "bajaj","pulsar",insurers);
//        when(quotationRepo.save(quotation)).thenReturn(quotation);
//        assertEquals(quotationServices.addQuotation(quotation), quotation.getRequestId());
//    }
//
//    //Junit test case for getting one Quotation details by requestId
//    @Test
//    public void getOneQuotationTest(){
//        List<SupportedInsurers> insurers = new ArrayList<SupportedInsurers>();
//        insurers.add(new SupportedInsurers("Digit",9000));
//        insurers.add(new SupportedInsurers("CHOL",8000));
//        Quotation quotation1 = new Quotation("AAAAAAA","TW",
//                "bajaj","pulsar",insurers);
//        Quotation quotation2 =new Quotation("BBBBBBB","FW","hundai",
//                "i10",insurers);
//        when(quotationRepo.findQuotationById("BBBBBBB")).thenReturn(quotation2);
//        assertEquals(quotation2,quotationServices.getOneQuotation("BBBBBBB"));
//    }
//
//    //Junit test case for deleting Quotation by requestId
//    @Test
//    public void deleteQuotationTest(){
//        List<SupportedInsurers> insurers = new ArrayList<SupportedInsurers>();
//        insurers.add(new SupportedInsurers("Digit",9000));
//        insurers.add(new SupportedInsurers("CHOL",8000));
//        Quotation quotation =new Quotation("AAAAAAA","TW",
//                "bajaj","pulsar",insurers);
//        quotationServices.deleteQuotation("AAAAAAA");
//        verify(quotationRepo,times(1)).delete(quotationRepo.findQuotationById("AAAAAAA"));
//    }
//
//    //Junit Test case for updating Quotation details by requestId
//    @Test
//    public void updateVehicleTest(){
//        List<SupportedInsurers> insurers = new ArrayList<SupportedInsurers>();
//        insurers.add(new SupportedInsurers("Digit",9000));
//        insurers.add(new SupportedInsurers("CHOL",8000));
//        Quotation quotation1= new Quotation("AAAAAAA","TW",
//                "bajaj","pulsar",insurers);
//        Quotation quotation2 =new Quotation("BBBBBBB","FW","hundai",
//                "i10",insurers);
//        when(quotationServices.updateQuotation("AAAAAAA", quotation2)).thenReturn(quotation2);
//        assertEquals(quotation2,quotationServices.getOneQuotation("AAAAAAA"));
//    }


}