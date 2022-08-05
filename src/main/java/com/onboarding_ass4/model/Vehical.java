package com.onboarding_ass4.model;

import org.springframework.data.annotation.Id;

public class Vehical {
    @Id
    private String requestId;
    private String vertical;
    private String make;
    private String model;
    private String insurer_name;
    private String premium;

    public Vehical(String requestId, String vertical, String make, String model, String insurer_name, String premium) {
        this.requestId = requestId;
        this.vertical = vertical;
        this.make = make;
        this.model = model;
        this.insurer_name = insurer_name;
        this.premium = premium;
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

    public String getInsurer_name() {
        return insurer_name;
    }

    public void setInsurer_name(String insurer_name) {
        this.insurer_name = insurer_name;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }
}
