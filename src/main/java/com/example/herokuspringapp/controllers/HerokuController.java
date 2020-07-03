package com.example.herokuspringapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(HerokuController.BASE_URL)
public class HerokuController {

    public static final String BASE_URL = "/api/v1/heroku";

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity openShiftApi() {
        return ResponseEntity.ok("Test Heroku API");
    }
}
