package com.onboarding_ass4.controllers;

import com.onboarding_ass4.model.Quotation;
import com.onboarding_ass4.services.QuotationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuotationController {

    @Autowired
    public QuotationServices quotationServices;

    //get all quotations
    @GetMapping("/api/get/quotations")
    public List<Quotation> getAllDetails(){
        return quotationServices.getAllQuotationDetails();
    }

    //add new quotation
    @PostMapping("/api/add/quotation")
    public String addQuotation(@RequestBody Quotation quotation){
        quotationServices.addQuotation(quotation);
        return quotation.getRequestId();
    }

    //Get One Quotation Details
    @GetMapping("/api/get/quotation/{requestId}")
    public Quotation getOneQuotation(@PathVariable String requestId){
        return quotationServices.getOneQuotation(requestId);
    }

    //delete quotation
    @DeleteMapping("/api/delete/quotation/{requestId}")
    public String deleteQuotation(@PathVariable String requestId){
        quotationServices.deleteQuotation(requestId);
        return "Quotation Deleted Successfully";
    }

    //update quotation
    @PutMapping("/api/update/quotation/{requestId}")
    public Quotation updateQuotation(@RequestBody Quotation quotation, @PathVariable String requestId){
        return quotationServices.updateQuotation(requestId, quotation);
    }
}
