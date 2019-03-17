package com.sherlock.Model;

public class PersonalInfo {

    private String Name;
    private String Occupation;
    private String DateOfBirth;
    private String Company;
    private String LinkedIn;
    private String Bio;
    private String ProfileImage;
    private String Github;

    public PersonalInfo(String name, String occupation, String dateOfBirth, String company, String linkedIn, String bio, String profileImage, String github) {
        Name = name;
        Occupation = occupation;
        DateOfBirth = dateOfBirth;
        Company = company;
        LinkedIn = linkedIn;
        Bio = bio;
        ProfileImage = profileImage;
        Github = github;
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

    public String getLinkedIn() {
        return LinkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        LinkedIn = linkedIn;
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
    public String getGithub() {
        return Github;
    }

    public void setGithub(String github) {
        Github = github;
    }

}
