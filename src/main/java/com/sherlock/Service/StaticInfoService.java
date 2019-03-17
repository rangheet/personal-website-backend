package com.sherlock.Service;


import com.sherlock.Model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StaticInfoService implements StaticInfoInterface {

    public StaticInfoService()
    {

    }

    @Override
    public PersonalInfo GetPersonalInfo() {

        return new PersonalInfo("Heet Dave", "Software Engineer", "856377000000", "Endurance International Group","https://www.linkedin.com/in/heetdave/","This is my bio.", "Sherlock Icon.png","https://github.com/rangheet");

    }

    @Override
    public List<Experience> GetExperiences() {

        Experience experience1=new Experience("Endurance Intl. Group", "1544985000000", "","Dhanya Angepat","NA", "ReactJS and Java SpringBoot", "Software Engineer");
        Experience experience2=new Experience("Fintech Global Center", "1526236200000", "1544725800000","Pratik Joshi","NA", "C#, Javascript, jQuery, Docker, Jenkins", "Software Engineer");

        List<Experience> experiences=new ArrayList<>();
        experiences.add(experience1);
        experiences.add(experience2);

        return experiences;

    }

    @Override
    public List<Elective> GetElectives() {

        Elective elective1 = new Elective("Data Structure", "IT-110", "DA-IICT");
        Elective elective2 = new Elective("Algorithms", "IT-115", "DA-IICT");

        List<Elective> electives = new ArrayList<>();
        electives.add(elective1);
        electives.add(elective2);

        return electives;
    }

    @Override
    public List<Project> GetProjects() {

        Project project1 = new Project("Information Retrieval Project","DA-IICT",new ArrayList<>(Arrays.asList("Information Retrieval","N-gram","ETC")), "IRDescription");
        Project project2 = new Project("IoT Project","DA-IICT",new ArrayList<>(Arrays.asList("IoT","OpenCV","ETC")), "IoTDescription");

        List<Project> projects = new ArrayList<>();
        projects.add(project1);
        projects.add(project2);

        return projects;
    }

    @Override
    public List<Skill> GetSkills() {

        Skill skill1 = new Skill("C++",9);
        Skill skill2 = new Skill("C#",8);

        List<Skill> skills = new ArrayList<>();
        skills.add(skill1);
        skills.add(skill2);

        return skills;

    }

    @Override
    public List<Extracurricular> GetExtracurricular() {

        Extracurricular extracurricular1 = new Extracurricular("DA-IICT", "2016-2017","Core Committee Member","DescriptionDA-IICT","Gujarat", "India");
        Extracurricular extracurricular2 = new Extracurricular("Agaria Heet Rakshak Manch", "December 2015","Volunteer","DescriptionRI","Gujarat", "India");

        List<Extracurricular> extracurriculars = new ArrayList<>();
        extracurriculars.add(extracurricular1);
        extracurriculars.add(extracurricular2);

        return extracurriculars;
    }

    @Override
    public List<Education> GetEducation() {

        Education education1 = new Education("DA-IICT",2014,2018, (float) 7.06, "Gandhinagar","Gujarat","India");

        List<Education> educations = new ArrayList<>();
        educations.add(education1);

        return educations;

    }

    @Override
    public Logos GetLogos() {
        return new Logos("github-logo-white.png","linkedin-logo-white.svg","","","","","");
    }

}
