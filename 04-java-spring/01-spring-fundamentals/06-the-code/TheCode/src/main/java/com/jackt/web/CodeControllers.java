package com.jackt.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeControllers {
	@RequestMapping("/")
	public String home(HttpSession session) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}
		Integer count = (Integer) session.getAttribute("count");
		count++;
		session.setAttribute("count", count);
		return "index.jsp";
	}
	
	@RequestMapping(value="/test" , method=RequestMethod.POST)
	public String test(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		System.out.println(code);
		if(code.contentEquals("bushido")) {
			return "redirect:/counter";
		}
		redirectAttributes.addFlashAttribute("error", "You must train harder.");
		return "redirect:/";				
	}
	
	@RequestMapping("/counter")
	public String code(Model model, HttpSession session) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}
		Integer count = (Integer) session.getAttribute("count");
		model.addAttribute("count", count);
		return "code.jsp";
	}
}
