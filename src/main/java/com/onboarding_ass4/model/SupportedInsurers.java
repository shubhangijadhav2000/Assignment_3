package com.onboarding_ass4.model;

import org.springframework.data.annotation.Id;

public class SupportedInsurers {
    @Id
    public String insurerId;
    public String insurer_name;
    public int premium;

    public SupportedInsurers(String insurerId, String insurer_name, int premium) {
        this.insurerId = insurerId;
        this.insurer_name = insurer_name;
        this.premium = premium;
    }

    public String getInsurerId() {
        return insurerId;
    }

    public void setInsurerId(String insurerId) {
        this.insurerId = insurerId;
    }

    public String getInsurer_name() {
        return insurer_name;
    }

    public void setInsurer_name(String insurer_name) {
        this.insurer_name = insurer_name;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }
}
