package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")

public class ApplicationController {

    @GetMapping
    public String sayWelcome()
    {
        return "Welcome to Finetech to csi";
    }
    @GetMapping("/service")
    public String sayService()
    {
        return "software development | QR code";
    }
    @GetMapping("/address")
    public String address()
    {
        return "Pune";
    }
    @GetMapping("/salary")
    public String saySalary()
    {

        return "7.9lpa";
    }
    @GetMapping("/course")
    public String sayCourse()
    {

        return "full stack";
    }

}
