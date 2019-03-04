package com.sherlock.ExceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = { Exception.class })
    public String GlobalException(Exception ex)
    {
        return "Exception "+ ex.getMessage();
    }
}
