package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping("/AdminAdding")
	public String AdminAdding() {
		return "AdminAdding";
	}
	
	
}
