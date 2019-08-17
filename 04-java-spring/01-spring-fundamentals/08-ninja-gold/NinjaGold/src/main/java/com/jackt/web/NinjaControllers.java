package com.jackt.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/Gold")
public class NinjaControllers {
	
	@RequestMapping("")
	public String index(HttpSession session) {
		if(session.getAttribute("gold")==null) {
			session.setAttribute("gold", 0);
			ArrayList<String> log = new ArrayList<String>();
			session.setAttribute("log", log);
		}
		
		return "index.jsp";		
	}
	
	@RequestMapping("/calc")
	public String calc(HttpSession session, RedirectAttributes redirectAttributes, @RequestParam(value="name") String name ) {
		Random num =new Random();
		Integer val=0;
		Date now = new Date();
		SimpleDateFormat  format = new SimpleDateFormat("MMMM d yyyy HH:mm a");
		String string="";
		if(name.contentEquals("farm")) {
			val = num.nextInt(11) +10;
			string = "You entered the farm and earned "+val+" gold. ("+format.format(now)+")";
			val += (Integer) session.getAttribute("gold");
		}
		else if(name.contentEquals("cave")) {
			val = num.nextInt(6) +5;
			string = "You entered the cave and earned "+val+" gold. ("+format.format(now)+")";
			val += (Integer) session.getAttribute("gold");			
			
		}
		else if(name.contentEquals("house")) {
			val = num.nextInt(4) +2;
			string = "You entered the farm and earned "+val+" gold. ("+format.format(now)+")";
			val += (Integer) session.getAttribute("gold");
		}
		else if(name.contentEquals("casino")) {
			val = num.nextInt(101)-50;			
			if(val<0) {
				Integer notneg = val * -1;
				string = "You entered the casino and lost "+notneg+" gold... Ouch! ("+format.format(now)+")";
			}
			else {
				string = "You entered the casino and earned "+val+" gold. ("+format.format(now)+")";
			}
			val += (Integer) session.getAttribute("gold");
		}
		else {
			return "redirect:/Gold";
		}
		session.setAttribute("gold", val);
		ArrayList<String> log = (ArrayList<String>) session.getAttribute("log");
		log.add(string);
		session.setAttribute("log", log);		
		return "redirect:/Gold";
	}

}
