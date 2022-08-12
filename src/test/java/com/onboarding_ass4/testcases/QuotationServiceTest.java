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

    @Autowired
    public QuotationServices quotationServices;

    @MockBean
    public QuotationRepo quotationRepo;

    //Junit test case for getting all quotation details
    @Test
    public void getAllQuotationDetailsTest(){
        SupportedInsurers insurers1=new SupportedInsurers("Digit",9000);
        SupportedInsurers insurers2=new SupportedInsurers("CHOL",8000);
        when(quotationRepo.findAll()).thenReturn(Stream.of(new Quotation("AAAAAAA","TW",
                        "bajaj","pulsar", insurers1),
                new Quotation("BBBBBBB","FW","hundai",
                        "i10",insurers2)).collect(Collectors.toList()));
        assertEquals(2,quotationServices.getAllQuotationDetails().size());
    }

    //Junit test case for adding new Quotation details
    @Test
    public void addQuotationTest(){
        SupportedInsurers insurers1=new SupportedInsurers("Digit",9000);
        SupportedInsurers insurers2=new SupportedInsurers("CHOL",8000);
        Quotation quotation =new Quotation("AAAAAAA","TW",
                "bajaj","pulsar",insurers1);
        when(quotationRepo.save(quotation)).thenReturn(quotation);
        assertEquals(quotationServices.addQuotation(quotation), quotation.getRequestId());
    }

    //Junit test case for getting one Quotation details by requestId
    @Test
    public void getOneQuotationTest(){
        SupportedInsurers insurers1=new SupportedInsurers("Digit",9000);
        SupportedInsurers insurers2=new SupportedInsurers("CHOL",8000);
        Quotation quotation1 = new Quotation("AAAAAAA","TW",
                "bajaj","pulsar",insurers1);
        Quotation quotation2 =new Quotation("BBBBBBB","FW","hundai",
                "i10",insurers2);
        when(quotationRepo.findQuotationById("BBBBBBB")).thenReturn(quotation2);
        assertEquals(quotation2,quotationServices.getOneQuotation("BBBBBBB"));
    }

    //Junit test case for deleting Quotation by requestId
    @Test
    public void deleteQuotationTest(){
        SupportedInsurers insurers1=new SupportedInsurers("Digit",9000);
        Quotation quotation =new Quotation("AAAAAAA","TW",
                "bajaj","pulsar",insurers1);
        quotationServices.deleteQuotation("AAAAAAA");
        verify(quotationRepo,times(1)).delete(quotationRepo.findQuotationById("AAAAAAA"));
    }

    //Junit Test case for updating Quotation details by requestId
    @Test
    public void updateVehicleTest(){
        SupportedInsurers insurers1=new SupportedInsurers("Digit",9000);
        SupportedInsurers insurers2=new SupportedInsurers("CHOL",8000);
        Quotation quotation1= new Quotation("AAAAAAA","TW",
                "bajaj","pulsar",insurers1);
        Quotation quotation2 =new Quotation("BBBBBBB","FW","hundai",
                "i10",insurers2);
        when(quotationServices.updateQuotation("AAAAAAA", quotation2)).thenReturn(quotation2);
        assertEquals(quotation2,quotationServices.getOneQuotation("AAAAAAA"));
    }


}