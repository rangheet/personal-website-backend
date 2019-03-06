package com.sherlock.Model;

public class Experience {

    private String CompanyName;
    private String Position;
    private String StartTime;
    private String EndTime;
    private String MentorName;
    private String MentorContact;
    private String WorkDescription;

    public Experience(String CompanyName, String StartTime, String EndTime, String MentorName, String MentorContact, String WorkDescription, String Position)
    {
        this.CompanyName=CompanyName;
        this.StartTime=StartTime;
        this.EndTime=EndTime;
        this.MentorContact = MentorContact;
        this.MentorName=MentorName;
        this.WorkDescription=WorkDescription;
        this.Position=Position;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getMentorName() {
        return MentorName;
    }

    public void setMentorName(String mentorName) {
        MentorName = mentorName;
    }

    public String getMentorContact() {
        return MentorContact;
    }

    public void setMentorContact(String mentorContact) {
        MentorContact = mentorContact;
    }

    public String getWorkDescription() {
        return WorkDescription;
    }

    public void setWorkDescription(String workDescription) {
        WorkDescription = workDescription;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

}
