package com.BlogBackEnd.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @className GlobalAdvice
 * @author Anke Zuo
 * @description monitor for all the http requests
 * @updateTime 2/9/23 02:11
 * @version 1.0
 */
@RestControllerAdvice
public class GlobalAdvice {
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e) {
        e.printStackTrace();
        return "Error!";
    }
}
