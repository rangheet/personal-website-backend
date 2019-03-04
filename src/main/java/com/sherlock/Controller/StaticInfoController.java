package com.sherlock.Controller;

import com.sherlock.Model.Experience;
import com.sherlock.Model.PersonalInfo;
import com.sherlock.Service.StaticInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@Component
@RequestMapping("/api")
@RestController
public class StaticInfoController {

    private StaticInfoService staticInfoService;

    @Autowired
    StaticInfoController(StaticInfoService staticInfoService)
    {
        this.staticInfoService = staticInfoService;
    }

    @RequestMapping(value = "/PersonalInfo", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<PersonalInfo> GetPersonalInfo() {
        return new ResponseEntity<>(staticInfoService.GetPersonalInfo(), HttpStatus.OK);
    }

    @RequestMapping(value = "/Experiences", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity< List<Experience> > GetExperiences(){
        return new ResponseEntity<>(staticInfoService.GetExperiences(), HttpStatus.OK);
    }

}

