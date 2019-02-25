package com.sherlock.ExceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = { Exception.class })
    public String GlobalException(Exception ex)
    {
        //System.out.println("Global Exception");
        return "Exception "+ ex.getMessage();
    }
}
