package com.onboarding_ass4.services;

import com.onboarding_ass4.model.Quotation;

import java.util.List;

public interface QuotationServices {

    String addQuotation(Quotation quotation);

    List<Quotation> getAllQuotationDetails();

    Quotation getOneQuotation(String requestId);

    void deleteQuotation(String requestId);

    Quotation updateQuotation(String requestId, Quotation quotation);
}
