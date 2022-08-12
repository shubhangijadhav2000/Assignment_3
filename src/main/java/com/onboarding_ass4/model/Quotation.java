package com.onboarding_ass4.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "quotations")
public class Quotation {
    @Id
    private String requestId;
    private String vertical;
    private String make;
    private String model;
    private SupportedInsurers supportedInsurers;

    public Quotation(String requestId, String vertical, String make, String model, SupportedInsurers supportedInsurers) {
        this.requestId = requestId;
        this.vertical = vertical;
        this.make = make;
        this.model = model;
        this.supportedInsurers = supportedInsurers;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getVertical() {
        return vertical;
    }

    public void setVertical(String vertical) {
        this.vertical = vertical;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public SupportedInsurers getSupportedInsurers() {
        return supportedInsurers;
    }

    public void setSupportedInsurers(SupportedInsurers supportedInsurers) {
        this.supportedInsurers = supportedInsurers;
    }
}
