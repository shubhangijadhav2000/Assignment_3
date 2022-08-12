package com.onboarding_ass4.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TW/FW-Request")
public class Vehicle {
    private String requestId;
    private String vertical;
    private String make;
    private String model;

    public Vehicle(String requestId, String vertical, String make, String model) {
        this.requestId = requestId;
        this.vertical = vertical;
        this.make = make;
        this.model = model;
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
}
