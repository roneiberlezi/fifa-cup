package com.sap.fifa.sapfifa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listUsers(){
        return "user1";
    }
}
