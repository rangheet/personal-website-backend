package com.sherlock.Service;

import com.sherlock.Model.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StaticInfoInterface {

    PersonalInfo GetPersonalInfo();
    List<Experience> GetExperiences();
    List<Elective> GetElectives();
    List<Project> GetProjects();
    List<Skill> GetSkills();
    List<Extracurricular> GetExtracurricular();
    List<Education> GetEducation();

}
