package com.niit.springmvc;


	import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class HomeController {
		
	@RequestMapping("/home")
	public String homePage(){
		return "home";
	}
	@RequestMapping("/about")
	public String aboutUs(){
		return "about";
		
	}
	@RequestMapping("/login")
	public String login(@RequestParam(value="error",required=false) String error,
			@RequestParam(value="logout",required=false) String logout, 
			Model model){
			if(error!=null)
		model.addAttribute("error","Invalid username and password");
		
		if(logout!=null)
			model.addAttribute("logout","You have logged out successfully");
		return"login";

	}
	}



