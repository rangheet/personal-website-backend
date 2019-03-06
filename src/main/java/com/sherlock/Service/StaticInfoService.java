package com.sherlock.Service;


import com.sherlock.Model.Experience;
import com.sherlock.Model.PersonalInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StaticInfoService implements StaticInfoInterface {

    public StaticInfoService()
    {

    }

    @Override
    public PersonalInfo GetPersonalInfo() {

        return new PersonalInfo("Heet Dave", "Software Engineer", "856377000000", "Endurance International Group","https://www.linkedin.com/in/heetdave/","This is my bio.", "Sherlock Icon.png");

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
}
