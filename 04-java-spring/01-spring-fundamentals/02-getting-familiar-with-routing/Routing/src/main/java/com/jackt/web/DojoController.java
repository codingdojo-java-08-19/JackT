package com.jackt.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
		
	@RequestMapping("/{path}")
	public String path(@PathVariable("path") String path) {
		if(path.contentEquals("dojo")) {
			return "The dojo is awesome!";
		}
		else if (path.contentEquals("burbank-dojo")) {
			return "Burbank dojo is located in Southern California";
		}
		else if (path.contentEquals("san-jose")) {
			return "SJ dojo is the Headquarters";
		}
		else {
			return path + ": isn't programmed in with a response";
		}
	}

}
