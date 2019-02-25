package com.sherlock.Model;

import java.util.Date;

public class Experience {

    private String CompanyName;
    private String StartTime;
    private String EndTime;
    private String MentorName;
    private String MentorContactNo;
    private String WorkDescription;

    public Experience(String CompanyName, String StartTime, String EndTime, String MentorName, String MentorContactNo, String WorkDescription)
    {
        this.CompanyName=CompanyName;
        this.StartTime=StartTime;
        this.EndTime=EndTime;
        this.MentorContactNo=MentorContactNo;
        this.MentorName=MentorName;
        this.WorkDescription=WorkDescription;
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

    public String getMentorContactNo() {
        return MentorContactNo;
    }

    public void setMentorContactNo(String mentorContactNo) {
        MentorContactNo = mentorContactNo;
    }

    public String getWorkDescription() {
        return WorkDescription;
    }

    public void setWorkDescription(String workDescription) {
        WorkDescription = workDescription;
    }

}
