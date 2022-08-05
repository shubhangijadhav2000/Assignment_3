package com.onboarding_ass4.model;

public class SupportedInsurers {
    private String Insurer_name;
    private String Premium;

    public SupportedInsurers(String insurer_name, String premium) {
        Insurer_name = insurer_name;
        Premium = premium;
    }

    public String getInsurer_name() {
        return Insurer_name;
    }

    public void setInsurer_name(String insurer_name) {
        Insurer_name = insurer_name;
    }

    public String getPremium() {
        return Premium;
    }

    public void setPremium(String premium) {
        Premium = premium;
    }
}
