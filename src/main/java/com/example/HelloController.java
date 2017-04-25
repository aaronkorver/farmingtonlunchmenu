package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Korver on 4/25/2017.
 */
@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String hello()
    {
        return "hello world";
    }

}
