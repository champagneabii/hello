package edu.fra.uas.hello.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

    @RequestMapping ( value = "hello" , method = RequestMethod.GET)
    @ResponseBody

    public String getHelloWorld () {

        return "<h1> Hello Ali! </h1>"; 
    }

    
}
