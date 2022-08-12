package com.onboarding_ass4.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "TW/FW-Response")
public class Profile {

    private String requestId;
    private SupportedInsurers supportedInsurers;
    private String resultId;

    public Profile() {
    }

    public Profile(String requestId, SupportedInsurers supportedInsurers, String resultId) {
        this.requestId = requestId;
        this.supportedInsurers = supportedInsurers;
        this.resultId = resultId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public SupportedInsurers getSupportedInsurers() {
        return supportedInsurers;
    }

    public void setSupportedInsurers(SupportedInsurers supportedInsurers) {
        this.supportedInsurers = supportedInsurers;
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }
}
