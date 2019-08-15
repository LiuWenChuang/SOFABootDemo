package com.liuchuang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class DemoController {
    @GetMapping(value = "/world")
    public String hole(String text){
      return text+": sofaboot";
    }

}
