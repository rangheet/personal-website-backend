package com.sherlock.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class CustomErrorController implements ErrorController {


    @RequestMapping("/error")
    public String ReturnError()
    {
        return "Error!";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
