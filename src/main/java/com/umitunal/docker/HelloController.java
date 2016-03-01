package com.umitunal.docker;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/{name}")
    public String hello(@PathVariable String name) {
        return "Hello. My name is " + name ;
    }

}
