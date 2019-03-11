package com.sherlock.Controller;

import com.sherlock.Model.*;
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

    @RequestMapping(value = "/Education", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity< List<Education> > GetEducation(){
        return new ResponseEntity<>(staticInfoService.GetEducation(), HttpStatus.OK);
    }

    @RequestMapping(value = "/Projects", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity< List<Project> > GetProjects(){
        return new ResponseEntity<>(staticInfoService.GetProjects(), HttpStatus.OK);
    }

    @RequestMapping(value = "/Skills", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity< List<Skill> > GetSkills(){
        return new ResponseEntity<>(staticInfoService.GetSkills(), HttpStatus.OK);
    }

    @RequestMapping(value = "/Electives", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity< List<Elective> > GetElectives(){
        return new ResponseEntity<>(staticInfoService.GetElectives(), HttpStatus.OK);
    }

    @RequestMapping(value = "/Extracurricular", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity< List<Extracurricular> > GetExtracurricular(){
        return new ResponseEntity<>(staticInfoService.GetExtracurricular(), HttpStatus.OK);
    }

}

