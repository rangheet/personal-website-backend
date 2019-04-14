package com.sherlock.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Project {

    private String Title;
    private String Company;
    private List<String> TechnologiesUsed;
    private List<String> Description;
    private String ProjectType;

    public Project(String title, String company, List<String> technologiesUsed, List<String> description, String ProjectType) {
        this.Title = title;
        this.Company = company;
        this.TechnologiesUsed = technologiesUsed;
        this.Description = description;
        this.ProjectType= ProjectType;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        this.Company = company;
    }

    @JsonProperty("technologies")
    public List<String> getTechnologiesUsed() {
        return TechnologiesUsed;
    }

    public void setTechnologiesUsed(List<String> technologiesUsed) {
        this.TechnologiesUsed = technologiesUsed;
    }

    @JsonProperty("projectDescription")
    public List<String> getDescription() {
        return Description;
    }

    public void setDescription(List<String> description) {
        this.Description = description;
    }

    public String getProjectType() {
        return ProjectType;
    }

    public void setProjectType(String projectType) {
        ProjectType = projectType;
    }
}
