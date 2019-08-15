package com.jackt.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.text.SimpleDateFormat;

@Controller
public class ClassControllers {
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/date")
	public String date(Model model) {
		Date today = new Date();
		SimpleDateFormat day = new SimpleDateFormat("EEEE");
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		SimpleDateFormat date = new SimpleDateFormat("d");
		SimpleDateFormat month = new SimpleDateFormat("MMMM");
		
		model.addAttribute("date", day.format(today)+", the " + date.format(today) + " of " + month.format(today) + ", " + year.format(today));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date time = new Date();
		SimpleDateFormat hour = new SimpleDateFormat("h");
		SimpleDateFormat minute = new SimpleDateFormat("m");
		SimpleDateFormat ampm = new SimpleDateFormat("a");
		
		model.addAttribute("time", hour.format(time)+":" + minute.format(time) + ampm.format(time));
		return "time.jsp";
	}
}
