package com.onboarding_ass4.services;

import com.onboarding_ass4.model.Quotation;
import com.onboarding_ass4.model.Vehicle;
import com.onboarding_ass4.repos.QuotationRepo;
import com.onboarding_ass4.repos.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class QuotationServicesImpl implements QuotationServices{

    @Autowired
    public QuotationRepo quotationRepo;

    @Override
    public String addQuotation(Quotation quotation){
        String Id;
        while(true){
            Id = createRequestId();
            if(quotationRepo.findQuotationById(Id)==null){
                break;
            }
        }
        quotation.setRequestId(Id);
        Quotation quotation1 =quotationRepo.save(quotation);
        return quotation1.getRequestId();
    }

    @Override
    public List<Quotation> getAllQuotationDetails(){
        List<Quotation> quotationList = quotationRepo.findAll();
        return quotationList;
    }

    @Override
    public Quotation getOneQuotation(String requestId) {

        return quotationRepo.findQuotationById(requestId);
    }

    @Override
    public void deleteQuotation(String requestId){

        Quotation quotation =quotationRepo.findQuotationById(requestId);
        quotationRepo.delete(quotation);
    }

    @Override
    public Quotation updateQuotation(String requestId, Quotation quotation) {

        Quotation quotation1 =quotationRepo.findQuotationById(requestId);
        //update requestId
        if(Objects.nonNull(quotation.getRequestId())&&"".equalsIgnoreCase(quotation.getRequestId())){
            quotation1.setRequestId(quotation.getRequestId());
        }
        //update Vertical
        if(Objects.nonNull(quotation.getVertical())&&"".equalsIgnoreCase(quotation.getVertical())){
            quotation1.setVertical(quotation.getVertical());
        }

        //update Make
        if(Objects.nonNull(quotation.getMake())&&"".equalsIgnoreCase(quotation.getMake())){
            quotation1.setMake(quotation.getMake());
        }
        //Update Model
        if(Objects.nonNull(quotation.getModel())&&"".equalsIgnoreCase(quotation.getModel())){
            quotation1.setModel(quotation.getModel());
        }


        return quotation1;
    }

    //create random requestId
    public String createRequestId() {

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder id = new StringBuilder(10);

        for (int i = 0; i < 10; i++) {

            // generate a random number between 0 to AlphaNumericString variable length
            int index = (int)(AlphaNumericString.length() * Math.random());

            // add Character one by one in end of id
            id.append(AlphaNumericString.charAt(index));
        }
        return id.toString().toUpperCase();
    }


}
