package com.jackt.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CodingControllers {
	@RequestMapping("")
	public String index(@RequestParam(value="fname", required = false) String fname, @RequestParam(value="lname", required = false) String lname) {
		
		if(fname==null && lname==null) {
			return "Hello Human";
		}
		else if(fname!=null && lname!=null) {
			return "Hello " + fname + " " + lname;
		}
		else if(fname!=null) {
			return "Hello " + fname;
		}
		else {
			return "Hello " + lname;
		}
	}

}
