package com.sherlock.Service;


import com.sherlock.Model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

@Service
public class StaticInfoService implements StaticInfoInterface {

    public StaticInfoService()
    {

    }

    @Override
    public PersonalInfo GetPersonalInfo() {

        return new PersonalInfo("Heet Dave", "Software Engineer", "856377000000", "Endurance International Group", "This is my bio.", "Sherlock Icon.png");

    }

    @Override
    public List<Experience> GetExperiences() {

        Experience experience1=new Experience("Endurance International Group", "1544985000000", "","Dhanya Angepat","NA", "ReactJS and Java SpringBoot", "Software Engineer","Bangalore, India", new Logo("Endurance", "endurance-logo.jpeg","https://www.endurance.com/"), new ArrayList<>(Arrays.asList("ReactJS", "SpringBoot")));
        Experience experience2=new Experience("Fintech Global Center", "1526236200000", "1544725800000","Pratik Joshi","NA", "C#, Javascript, jQuery, Docker, Jenkins", "Software Engineer", "Gandhinagar, India", new Logo("FintechGlobalCenter", "fintech-global-center-logo.jpeg","https://www.fintechglobal.center/"), new ArrayList<>(Arrays.asList("C#", "Javascript", "jQuery", "Docker", "Jenkins")));
        Experience experience3=new Experience("Indian Space Research Organization (ISR0)", "1514887200000", "1526032800000","Akhilesh Sharma","NA", "NLP, Neural Network, Python", "Intern","Ahmedabad, India", new Logo("ISRO", "isro-logo.jpg","https://www.isro.gov.in/"), new ArrayList<>(Arrays.asList("NLP", "Neural Network", "Python")));


        List<Experience> experiences=new ArrayList<>();
        experiences.add(experience1);
        experiences.add(experience2);
        experiences.add(experience3);
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

        Project project1 = new Project("Information Retrieval Project","DA-IICT",new ArrayList<>(Arrays.asList("Information Retrieval","N-gram","ETC")), "IRDescription","Academic");
        Project project2 = new Project("IoT Project","DA-IICT",new ArrayList<>(Arrays.asList("IoT","OpenCV","ETC")), "IoTDescription","Academic");
        Project project3 = new Project("Personal Website","",new ArrayList<>(Arrays.asList("HTML","CSS","ReactJS", "SpringBoot")), "Personal PrijectDescription","Personal");


        List<Project> projects = new ArrayList<>();
        projects.add(project1);
        projects.add(project2);
        projects.add(project3);

        return projects;
    }

    @Override
    public List<Skill> GetSkills() {

        Skill skill1 = new Skill("C++",9, "Language");
        Skill skill2 = new Skill("C#",8, "Language");
        Skill skill3 = new Skill("JIRA",8, "PM");
        Skill skill4 = new Skill(".NET",8, "WebTech");
        Skill skill5 = new Skill("ReactJS",8, "WebTech");


        List<Skill> skills = new ArrayList<>();
        skills.add(skill1);
        skills.add(skill2);
        skills.add(skill3);
        skills.add(skill4);
        skills.add(skill5);


        return skills;

    }

    @Override
    public List<Extracurricular> GetExtracurricular() {

        Extracurricular extracurricular1 = new Extracurricular("Synapse, DA-IICT", "2016-2017","Core Committee Member","DescriptionDA-IICT","Gujarat", "India");
        Extracurricular extracurricular2 = new Extracurricular("Agaria Heet Rakshak Manch", "December 2015","Volunteer","DescriptionRI","Gujarat", "India");

        List<Extracurricular> extracurriculars = new ArrayList<>();
        extracurriculars.add(extracurricular1);
        extracurriculars.add(extracurricular2);

        return extracurriculars;
    }

    @Override
    public List<Education> GetEducation() {

        Education education1 = new Education("Dhirubhai Ambani Institute of Information and Communication Technology (DA-IICT)",2014,2018, (float) 7.06, "Gandhinagar","Gujarat","India", new Logo("DA-IICT", "daiict-logo.jpg","https://www.daiict.ac.in/"), "DA-IICT");
        List<Education> educations = new ArrayList<>();
        educations.add(education1);

        return educations;

    }

    @Override
    public HashMap<String, Logo> GetLogos() {

        Logo Github = new Logo("Github", "github-logo-white.png","https://github.com/rangheet");
        Logo LinkedIn = new Logo("LinkedIn", "linkedin-logo-white.svg", "https://www.linkedin.com/in/heetdave/");

        HashMap<String, Logo> Logos= new HashMap<>();
        Logos.put("Github", Github);
        Logos.put("LinkedIn", LinkedIn);

        return Logos;
    }

}
