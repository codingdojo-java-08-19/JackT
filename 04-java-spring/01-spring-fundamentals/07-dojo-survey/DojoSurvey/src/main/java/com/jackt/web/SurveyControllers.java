package com.jackt.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SurveyControllers {
	@RequestMapping("/")
	public String home(HttpSession session) {
		return "index.jsp";
	}
	
	@RequestMapping(value="/create" , method=RequestMethod.POST)
	public String test(@RequestParam(value="name") String name, @RequestParam(value="location") String location, 
			@RequestParam(value="language") String language, @RequestParam(value="comment") String comment,RedirectAttributes redirectAttributes, HttpSession session) {
		if(name.length()>=2) {
			session.setAttribute("name", name);
			session.setAttribute("location", location);
			session.setAttribute("language", language);
			session.setAttribute("comment", comment);
			return "redirect:/result";
		}
		redirectAttributes.addFlashAttribute("error", "Not a valid name");
		return "redirect:/";
	}	
	@RequestMapping("/result")
	public String code(HttpSession session) {
		return "result.jsp";
	}
}
