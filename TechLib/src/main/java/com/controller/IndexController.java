package com.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {

@Autowired
	
	//private UserDao userdao;
	 
	 @RequestMapping("/")

public String index(){
	return "index";
}
	 /*
	 public ModelAndView indexpage(){
		   
		 ModelAndView mv= new ModelAndView("index"); 
		 return mv;
	 }*/
	
}
