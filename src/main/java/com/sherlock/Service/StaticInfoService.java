package com.sherlock.Service;


import com.sherlock.Model.Experience;
import com.sherlock.Model.PersonalInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class StaticInfoService implements StaticInfoInterface {

    public StaticInfoService()
    {

    }

    @Override
    public PersonalInfo GetPersonalInfo() {

//        Calendar calendar=Calendar.getInstance();
//        calendar.set(Calendar.YEAR,1997);
//        calendar.set(Calendar.DATE,20);
//        calendar.set(Calendar.MONTH,Calendar.FEBRUARY);
        return new PersonalInfo("Heet Dave", "Software Engineer", "20th Feb 1997");
    }

    @Override
    public List<Experience> GetExperiences() {

        Experience experience1=new Experience("Endurance Intl. Group", "Dec 2018", "Current","Dhanya Angepat","NA", "ReactJS and Java SpringBoot");
        Experience experience2=new Experience("Fintech Global Center", "May 2018", "Dec 2018","Pratik Joshi","NA", "C#, Javascript, jQuery, Docker, Jenkins");

        List<Experience> experiences=new ArrayList<>();
        experiences.add(experience1);
        experiences.add(experience2);

        return experiences;

    }
}
