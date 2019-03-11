package com.sherlock.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Elective {

    private String Name;
    private String CourseCode;
    private String Institute;

    public Elective(String name, String courseCode, String institute) {
        Name = name;
        CourseCode = courseCode;
        Institute = institute;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    public String getInstitute() {
        return Institute;
    }

    public void setInstitute(String institute) {
        Institute = institute;
    }

}
