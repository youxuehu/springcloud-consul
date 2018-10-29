package com.gq.consul.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloCOntroller {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request) {
        return "helle consul----------> "+request.getRequestURL();
    }
}
