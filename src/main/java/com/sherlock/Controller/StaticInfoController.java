package com.sherlock.Controller;

import com.sherlock.Model.*;
import com.sherlock.Service.StaticInfoService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    public ResponseEntity<PersonalInfo> GetPersonalInfo(@RequestParam(required = false) String username) {
        return new ResponseEntity<>(staticInfoService.GetPersonalInfo(username), HttpStatus.OK);
    }

    @RequestMapping(value = "/Experiences", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity< List<Experience> > GetExperiences(@RequestParam(required = false) String username){
        return new ResponseEntity<>(staticInfoService.GetExperiences(username), HttpStatus.OK);
    }

    @RequestMapping(value = "/Education", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity< List<Education> > GetEducation(@RequestParam(required = false) String username){
        return new ResponseEntity<>(staticInfoService.GetEducation(username), HttpStatus.OK);
    }

    @RequestMapping(value = "/Projects", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity< List<Project> > GetProjects(@RequestParam(required = false) String username){
        return new ResponseEntity<>(staticInfoService.GetProjects(username), HttpStatus.OK);
    }

    @RequestMapping(value = "/Skills", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity< List<Skill> > GetSkills(@RequestParam(required = false) String username){
        return new ResponseEntity<>(staticInfoService.GetSkills(username), HttpStatus.OK);
    }

    @RequestMapping(value = "/Electives", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity< List<Elective> > GetElectives(@RequestParam(required = false) String username){
        return new ResponseEntity<>(staticInfoService.GetElectives(username), HttpStatus.OK);
    }

    @RequestMapping(value = "/Extracurricular", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity< List<Extracurricular> > GetExtracurricular(@RequestParam(required = false) String username){
        return new ResponseEntity<>(staticInfoService.GetExtracurricular(username), HttpStatus.OK);
    }

    @RequestMapping(value = "/Logos", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<HashMap<String, Logo>> GetLogos(@RequestParam(required = false) String username){
        return new ResponseEntity<>(staticInfoService.GetLogos(username), HttpStatus.OK);
    }

    @RequestMapping(value = "/WebsiteData", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UsersWebsiteData> GetWebsiteDataForUser(@RequestParam(required = false) String username){
        System.out.println(username);
        return new ResponseEntity<>(staticInfoService.GetWebsiteDataForUser(username), HttpStatus.OK);
    }

    @RequestMapping(value = "/WebsiteData", method = RequestMethod.POST, consumes = "application/json")
    public UsersWebsiteData UpdateWebsiteDataForUser(@RequestBody UsersWebsiteData usersWebsiteData) {
        JSONObject jsonObject =  new JSONObject(usersWebsiteData);
        System.out.println("Posted Data" + jsonObject);

        return  staticInfoService.UpdateWebsiteDataForUser(usersWebsiteData);
//        return staticInfoService.UpdateWebsiteDataForUser(new UsersWebsiteData(jsonObject.getString("username"),jsonObject.getString("personalInfo"),
//                jsonObject.getString("experiences"), jsonObject.getString("education"), jsonObject.getString("projects"),
//                jsonObject.getString("skills"), jsonObject.getString("extracurricular"), jsonObject.getString("logos")));
    }

    @RequestMapping(value = "/User", method = RequestMethod.POST, consumes = "application/json")
    public Users UpdateUserProfile(@RequestBody String user) throws JSONException {
        JSONObject jsonObject =  new JSONObject(user);
        return staticInfoService.UpdateUserProfile(new Users(jsonObject.getString("username"),jsonObject.getString("fullname"),
                jsonObject.getString("password"), jsonObject.getString("dateOfBirth")));
    }
}

