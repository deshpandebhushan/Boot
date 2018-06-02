package com.sat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping(method = RequestMethod.GET,path = "/employees")
    public String getAllEmployees(){
        System.out.println("get Employee Controller");
        return "Testing";
    }

}
