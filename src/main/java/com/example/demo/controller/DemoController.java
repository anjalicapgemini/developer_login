package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;

import com.example.entities.LoginData;

@Controller
public class DemoController {
	/*@RequestMapping(value="/home", method=RequestMethod.GET)
	   public String test(Model model) {
		   System.out.println("opening");
		   LoginData loginData = new LoginData();
		   model.addAttribute("loginData",loginData);
		   return "home";
	   }
	   //handler for processing form
	   @RequestMapping(value="/home", method=RequestMethod.POST)
	   public String processForm(@Valid  LoginData loginData, BindingResult result, Model model) {
		   if(result.hasErrors()) {
			   System.out.println(result);
				return "home";
		   }
		   return "success";
	   }
}*/
   @RequestMapping(value="/home", method=RequestMethod.GET)
   public String test( @ModelAttribute("loginData") LoginData loginData) {
	   System.out.println("openning");
	   //model.addAttribute()
	   return "home";
   }
   //handler for processing form
   @RequestMapping("/home")
   public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result) {
	   if(result.hasErrors()) {
		   System.out.println(result);
		   List<ObjectError> allErrors= result.getAllErrors();
			for(ObjectError object: allErrors) {
				System.out.println(object);
			}
			return "home";
	   }
	   else {
	   System.out.println(loginData);
	   return "success";
   }
}
}