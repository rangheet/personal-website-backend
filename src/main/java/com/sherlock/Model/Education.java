package com.sherlock.Model;

public class Education {

    private String InstituteName;
    private int StartYear;
    private int EndYear;
    private float CGPA;
    private String City;
    private String State;
    private String Country;

    public Education(String instituteName, int startYear, int endYear, float CGPA, String city, String state, String country) {
        InstituteName = instituteName;
        StartYear = startYear;
        EndYear = endYear;
        this.CGPA = CGPA;
        City = city;
        State = state;
        Country = country;
    }

    public String getInstituteName() {
        return InstituteName;
    }

    public void setInstituteName(String instituteName) {
        InstituteName = instituteName;
    }

    public int getStartYear() {
        return StartYear;
    }

    public void setStartYear(int startYear) {
        StartYear = startYear;
    }

    public int getEndYear() {
        return EndYear;
    }

    public void setEndYear(int endYear) {
        EndYear = endYear;
    }

    public float getCGPA() {
        return CGPA;
    }

    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
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
