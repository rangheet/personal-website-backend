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

        return new PersonalInfo("Heet Dave", "Software Engineer", "856377000000", "Endurance International Group",
                "I am currently working at Endurance International Group as a Software Engineer. I am working on developing our new product using ReactJS and Java SpringBoot. " +
                "I have experience with working on both front-end and back-end as well as CI/CD tools such as Docker and Jenkins. I did my undergraduate studies from DA-IICT, Gujarat. " +
                "I have also worked in fields Information Retrieval, Machine Learning and Natural Language Processing during my internship at Indian Space Research Organization (ISRO).",
                "Sherlock Icon.png", "HeetDave_Resume.pdf");

    }

    @Override
    public List<Experience> GetExperiences() {

        Experience experience1=new Experience("Endurance International Group", "1544985000000", "","Dhanya Angepat","NA",
                new ArrayList<>(Arrays.asList("Designed and developed 'BE' module for invoices management according to business requirements,which is to be used by Web Professionals","Created and integrated new APIs to get data from core back-end","Add about docker secrets")), "Software Engineer","Bangalore, India", new Logo("Endurance", "endurance-logo.jpeg","https://www.endurance.com/"), new ArrayList<>(Arrays.asList("ReactJS", "Redux", "Redux-Saga", "Javascript", "SpringBoot", "Java", "Docker")));
        Experience experience2=new Experience("Fintech Global Center", "1526236200000", "1544725800000","Pratik Joshi","NA",
                new ArrayList<>(Arrays.asList("Developed both front-end and back-end of user management and software distribution application for financial trading platform administrators", "Developed SFTP client using company's framework to send trading information securely", "Setup Continuous Integration (CI) for core back-end projects")), "Software Engineer", "Gandhinagar, India", new Logo("FintechGlobalCenter", "fintech-global-center-logo.jpeg","https://www.fintechglobal.center/"), new ArrayList<>(Arrays.asList("ASP.NET Web APIs","C#", "Javascript", "jQuery", "Docker", "Jenkins")));
        Experience experience3=new Experience("Indian Space Research Organization (ISRO)", "1514887200000", "1526032800000","Akhilesh Sharma","NA",
                new ArrayList<>(Arrays.asList("Developed a tool to automate SRS checking process which leverages Neural Network and NLP techniques", "Used probabilistic N-gram model, POS and NER to extract features from text to train neural network")), "Intern","Ahmedabad, India", new Logo("ISRO", "isro-logo.jpg","https://www.isro.gov.in/"), new ArrayList<>(Arrays.asList("Python", "Natural Language Processing", "Neural Network",  "NLTK Library", "Stanford NLP Tools")));


        List<Experience> experiences=new ArrayList<>();
        experiences.add(experience1);
        experiences.add(experience2);
        experiences.add(experience3);
        return experiences;

    }

    @Override
    public List<Elective> GetElectives() {

        Elective elective1 = new Elective("Data Structures", "IT205", "DA-IICT");
        Elective elective2 = new Elective("Algorithms", "IT301", "DA-IICT");
        Elective elective3 = new Elective("Object Oriented Programming", "IT114", "DA-IICT");
        Elective elective4 = new Elective("Computer  Organization", "IT209", "DA-IICT");
        Elective elective5 = new Elective("Systems Software", "IT215", "DA-IICT");
        Elective elective6 = new Elective("Neural Networks", "IT481", "DA-IICT");
        Elective elective7 = new Elective("Database Management System", "IT304", "DA-IICT");
        Elective elective8 = new Elective("Human Computer Interaction", "IT476", "DA-IICT");
        Elective elective9 = new Elective("Information Retrieval", "IT550", "DA-IICT");
        Elective elective10 = new Elective("Software Engineering", "IT314", "DA-IICT");
        Elective elective11 = new Elective("Operating Systems", "IT308", "DA-IICT");
        Elective elective12 = new Elective("Internet of Things", "IT478", "DA-IICT");
        Elective elective13 = new Elective("Systems and Network Security", "IT453", "DA-IICT");
        Elective elective14 = new Elective("Compiler Design", "IT423", "DA-IICT");


        List<Elective> electives = new ArrayList<>();
        electives.add(elective1);
        electives.add(elective2);
        electives.add(elective3);
        electives.add(elective4);
        electives.add(elective5);
        electives.add(elective6);
        electives.add(elective7);
        electives.add(elective8);
        electives.add(elective9);
        electives.add(elective10);
        electives.add(elective11);
        electives.add(elective12);
        electives.add(elective13);
        electives.add(elective14);


        return electives;
    }

    @Override
    public List<Project> GetProjects() {

        Project project1 = new Project("Alzheimer disease detection using Neural Network","DA-IICT", new ArrayList<>(Arrays.asList("Neural Network","MATLAB")),
                new ArrayList<>(Arrays.asList("Developed Neural Network to detect Alzheimer from MRI of a brain",
                        "Used both Multilayer Perceptron (MLP) and Radial Basis Function (RBF) to detect the disease")),"Academic");

        Project project2 = new Project("Topic wise classification of news articles","DA-IICT", new ArrayList<>(Arrays.asList("Python","Information Retrieval","NLTK Library")),
                new ArrayList<>(Arrays.asList("Developed Naive Bayes classifier to categorize news articles according to topics",
                        "Used various NLP and Information Retrieval techniques such as Bag of Words model, normalization, Porter stemming algorithm, stopwords removal and Laplace smoothing for categorization",
                        "Achieved 0.78 F1 score with 20 Newsgroup dataset" )),"Academic");

        Project project3 = new Project("Dynamic traffic signal timer using OpenCV","DA-IICT", new ArrayList<>(Arrays.asList("Python","Internet of Things","OpenCV")),
                new ArrayList<>(Arrays.asList("Developed a system which sets traffic signal timer dynamically according to the traffic in the lane",
                        "Used Image Processing technique like background subtraction and blob detection to detect traffic density")),"Academic");

        Project project4 = new Project("Personal Website","Sherlock Inc.", new ArrayList<>(Arrays.asList("ReactJS","SprintBoot","Material-UI", "Javascript", "HTML", "CSS")),
                new ArrayList<>(Arrays.asList("Used ReactJS and SpringBoot to develop front-end and back-end respectively. Used redux and redux-saga to for state management and performing async tasks.",
                        "For design and layout, used Material-UI and CSS")),"Personal");


        List<Project> projects = new ArrayList<>();
        projects.add(project1);
        projects.add(project2);
        projects.add(project3);
        projects.add(project4);

        return projects;
    }

    @Override
    public List<Skill> GetSkills() {

        Skill skill1 = new Skill("C++",10, "Language");
        Skill skill2 = new Skill("C#",8, "Language");
        Skill skill3 = new Skill("JIRA",10, "PM");
        Skill skill4 = new Skill("ASP.NET WebAPI",9, "WebTech");
        Skill skill5 = new Skill("ReactJS",9, "WebTech");
        Skill skill6 = new Skill("C",10, "Language");
        Skill skill7 = new Skill("Java",9, "Language");
        Skill skill8 = new Skill("Javascript",9, "Language");
        Skill skill9 = new Skill("Python",8, "Language");
        Skill skill10 = new Skill("HTML",10, "Language");
        Skill skill11 = new Skill("SQL",8, "Language");
        Skill skill12 = new Skill("Java SpringBoot",8, "WebTech");
        Skill skill13 = new Skill("Amazon S3",9, "WebTech");
        Skill skill14 = new Skill("Docker",8, "DevOpsTools");
        Skill skill15 = new Skill("Jenkins",10, "DevOpsTools");
        Skill skill16 = new Skill("AJAX",10, "WebTech");
        Skill skill17 = new Skill("jQuery",9, "WebTech");
        Skill skill18 = new Skill("Git",9, "PM");
        Skill skill19 = new Skill("Scrum (Agile)",10, "PM");


        List<Skill> skills = new ArrayList<>();
        skills.add(skill1);
        skills.add(skill2);
        skills.add(skill3);
        skills.add(skill4);
        skills.add(skill5);
        skills.add(skill6);
        skills.add(skill7);
        skills.add(skill8);
        skills.add(skill9);
        skills.add(skill10);
        skills.add(skill11);
        skills.add(skill12);
        skills.add(skill13);
        skills.add(skill14);
        skills.add(skill15);
        skills.add(skill16);
        skills.add(skill17);
        skills.add(skill18);
        skills.add(skill19);


        return skills;

    }

    @Override
    public List<Extracurricular> GetExtracurricular() {

        Extracurricular extracurricular1 = new Extracurricular("Synapse, DA-IICT", "Apr 2016 - Mar 2017","Core Committee Member",
                "Played a key role in sponsorship, marketing and event management of Annual Festival. Dealt with various companies regarding sponsorship and marketing. As a team managed to get $70,000 for the fest.","Gujarat", "India");
        Extracurricular extracurricular2 = new Extracurricular("Agaria Heet Rakshak Manch", "December 2015","Volunteer",
                "Worked in desert area of Gujarat to spread awareness among salt farmers regarding use of solar water pump for salt farming.","Gujarat", "India");

        List<Extracurricular> extracurriculars = new ArrayList<>();
        extracurriculars.add(extracurricular1);
        extracurriculars.add(extracurricular2);

        return extracurriculars;
    }

    @Override
    public List<Education> GetEducation() {

        Education education1 = new Education("Dhirubhai Ambani Institute of Information and Communication Technology (DA-IICT)",2014,2018, (float) 7.06, "Gandhinagar","Gujarat","India", new Logo("DA-IICT", "daiict-logo.jpg","https://www.daiict.ac.in/"), "DA-IICT", "B.Tech in Information and Communication Technology (ICT)");
        List<Education> educations = new ArrayList<>();
        educations.add(education1);

        return educations;

    }

    @Override
    public HashMap<String, Logo> GetLogos() {

        Logo Github = new Logo("Github", "github-logo-white.png","https://github.com/rangheet");
        Logo LinkedIn = new Logo("LinkedIn", "linkedin-logo-white.svg", "https://www.linkedin.com/in/heetdave/");
        Logo Email = new Logo("Email", "email-icon.png", "mailto:heetdave@outlook.com");


        HashMap<String, Logo> Logos= new HashMap<>();
        Logos.put("Github", Github);
        Logos.put("LinkedIn", LinkedIn);
        Logos.put("Email", Email);

        return Logos;
    }

}
