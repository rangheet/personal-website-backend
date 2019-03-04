package com.sherlock.Model;

public class PersonalInfo {

    private String Name;
    private String Occupation;
    private String DateOfBirth;
    private String Company;
    private String LinkedIn;
    private String Bio;
    private String ProfileImage;

    public PersonalInfo(String Name, String Occupation, String DateOfBirth, String Company, String LinkedIn, String Bio, String ProfileImage)
    {
        this.Name=Name;
        this.Occupation=Occupation;
        this.DateOfBirth=DateOfBirth;
        this.Company=Company;
        this.LinkedIn=LinkedIn;
        this.Bio=Bio;
        this.ProfileImage=ProfileImage;
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

}
