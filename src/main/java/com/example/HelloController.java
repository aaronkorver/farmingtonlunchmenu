package com.example;

import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.POST, value="/webhook")
    public @ResponseBody APIResponse postit(@RequestBody APIRequest apiRequest)
    {
        System.out.println(apiRequest);
        return new APIResponse("Hello World","Display Hello World","My Head");
    }

}
