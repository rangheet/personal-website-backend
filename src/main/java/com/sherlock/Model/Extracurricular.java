package com.sherlock.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Extracurricular {

    private String Organization;
    private String TimeOfActivity;
    private String PositionInTheOrg;
    private String WorkDescription;
    private String State;
    private String Country;

    public Extracurricular(String organization, String timeOfActivity, String positionInTheOrg, String workDescription, String state, String country) {
        Organization = organization;
        TimeOfActivity = timeOfActivity;
        PositionInTheOrg = positionInTheOrg;
        WorkDescription = workDescription;
        State = state;
        Country = country;
    }

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String organization) {
        Organization = organization;
    }

    public String getTimeOfActivity() {
        return TimeOfActivity;
    }

    public void setTimeOfActivity(String timeOfActivity) {
        TimeOfActivity = timeOfActivity;
    }

    @JsonProperty("position")
    public String getPositionInTheOrg() {
        return PositionInTheOrg;
    }

    public void setPositionInTheOrg(String positionInTheOrg) {
        PositionInTheOrg = positionInTheOrg;
    }

    public String getWorkDescription() {
        return WorkDescription;
    }

    public void setWorkDescription(String workDescription) {
        WorkDescription = workDescription;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

}
