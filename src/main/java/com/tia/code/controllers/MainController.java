package com.tia.code.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		
		return "index.jsp";
	}
	
	@RequestMapping(path="/code", method=RequestMethod.POST)
	public String enterCode(@RequestParam(value="code")String code,
			HttpSession session) {
		session.setAttribute("code", code);
		if(code.equals("bushido")) {
			return "redirect:/results";
		
		} else {
			return "redirect:/createError";
		}
		
	}
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error" , "You must Train Harder!");
		return "redirect:/";
	}

	
	@RequestMapping("/results")
	public String code(HttpSession session) {
		return "results.jsp";
		
	}
}
