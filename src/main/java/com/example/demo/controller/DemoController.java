package com.example.demo.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class DemoController {
   @RequestMapping(value="/home")
   public String test() {
	   return "home.html";
   }
}
