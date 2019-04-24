package com.sherlock.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomePageController {

    @RequestMapping(value = "/userpage", method = RequestMethod.GET)
    public String GetHomePage(/*@PathVariable("username") String username*/)
    {
        return "homepage";
    }

}

