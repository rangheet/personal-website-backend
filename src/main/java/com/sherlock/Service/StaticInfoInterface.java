package com.sherlock.Service;

import com.sherlock.Model.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public interface StaticInfoInterface {

    PersonalInfo GetPersonalInfo(String username);
    List<Experience> GetExperiences(String username);
    List<Elective> GetElectives(String username);
    List<Project> GetProjects(String username);
    List<Skill> GetSkills(String username);
    List<Extracurricular> GetExtracurricular(String username);
    List<Education> GetEducation(String username);
    HashMap<String, Logo> GetLogos(String username);
    UsersWebsiteData GetWebsiteDataForUser(String username);
    UsersWebsiteData UpdateWebsiteDataForUser(UsersWebsiteData username);
    Users UpdateUserProfile(Users user);
}
