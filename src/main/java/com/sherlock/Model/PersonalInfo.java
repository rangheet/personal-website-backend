package com.sherlock.Model;

import java.util.Date;

public class PersonalInfo {

    private String Name;
    private String Occupation;
    private String DateOfBirth;

    public PersonalInfo(String Name, String Occupation, String DateOfBirth)
    {
        this.Name=Name;
        this.Occupation=Occupation;
        this.DateOfBirth=DateOfBirth;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }



}
