package com.sherlock.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sun.xml.internal.fastinfoset.util.StringIntMap;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class UsersWebsiteData {

    @Id
    @Column(name="username")
    private String Username;

    @Column(name="personal_info")
    private String PersonalInfo;

    @Column(name="experiences")
    private String Experiences;

    @Column(name="education")
    private String Education;

    @Column(name="projects")
    private String Projects;

    @Column(name="skills")
    private String Skills;

    @Column(name="extracurricular")
    private String Extracurricular;

    @Column(name="logos")
    private String Logos;

    public UsersWebsiteData()
    {

    }

    public UsersWebsiteData(String username, String personalInfo, String experiences, String education, String projects, String skills, String extracurricular, String logos) {
        Username = username;
        PersonalInfo = personalInfo;
        Experiences = experiences;
        Education = education;
        Projects = projects;
        Skills = skills;
        Extracurricular = extracurricular;
        Logos = logos;
    }

    public String getUsername() {
        return Username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        //System.out.println("USERNAMER "+username);
        Username = username;
    }

    public String getPersonalInfo() {
        return PersonalInfo;
    }

    @JsonProperty("personalInfo")
    public void setPersonalInfo(String personalInfo) {
        //System.out.println(" setPersonalInfo "+ personalInfo);
        PersonalInfo = personalInfo;
    }

    public String getExperiences() {
        return Experiences;
    }

    @JsonProperty("experiences")
    public void setExperiences(String experiences) {
        //JSONArray jsonArray = new JSONArray(experiences);
        //System.out.println(" setExperiences "+ new JSONObject(experiences.get(1)).toString());
        Experiences = experiences ;
    }

    public String getEducation() {
        return Education;
    }

    @JsonProperty("education")
    public void setEducation(String education) {
        Education = education;
    }

    public String getProjects() {
        return Projects;
    }

    @JsonProperty("projects")
    public void setProjects(String projects) {
        Projects = projects;
    }

    public String getSkills() {
        return Skills;
    }

    @JsonProperty("skills")
    public void setSkills(String skills) {
        Skills = skills;
    }

    public String getExtracurricular() {
        return Extracurricular;
    }

    @JsonProperty("extracurricular")
    public void setExtracurricular(String extracurricular) {
        Extracurricular = extracurricular;
    }

    public String getLogos() {
        return Logos;
    }

    @JsonProperty("logos")
    public void setLogos(String logos) {
        Logos = logos;
    }
}
