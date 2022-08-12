package com.onboarding_ass4.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Profile {
    @Id
    private String resultId;
    private List<SupportedInsurers> supportedInsurers;
    private  String requestId;

    public Profile(String resultId, List<SupportedInsurers> supportedInsurers, String requestId) {
        this.resultId = resultId;
        this.supportedInsurers = supportedInsurers;
        this.requestId = requestId;
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public List<SupportedInsurers> getSupportedInsurers() {
        return supportedInsurers;
    }

    public void setSupportedInsurers(List<SupportedInsurers> supportedInsurers) {
        this.supportedInsurers = supportedInsurers;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
