package com.sherlock.Model;

public class PersonalInfo {

    private String Name;
    private String Occupation;
    private String DateOfBirth;
    private String Company;
    private String Bio;
    private String ProfileImage;

    public PersonalInfo(String name, String occupation, String dateOfBirth, String company, String bio, String profileImage) {
        Name = name;
        Occupation = occupation;
        DateOfBirth = dateOfBirth;
        Company = company;
        Bio = bio;
        ProfileImage = profileImage;
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

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public String getProfileImage() {
        return ProfileImage;
    }

    public void setProfileImage(String profileImage) {
        ProfileImage = profileImage;
    }

}
