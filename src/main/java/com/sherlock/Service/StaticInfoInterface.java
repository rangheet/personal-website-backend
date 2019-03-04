package com.sherlock.Service;

import com.sherlock.Model.Experience;
import com.sherlock.Model.PersonalInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StaticInfoInterface {

    PersonalInfo GetPersonalInfo();
    List<Experience> GetExperiences();
}
