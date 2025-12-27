package com.aman.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Welcome {

	
	@RequestMapping(value = "/" )
	public String Display() {
		
		
		return "index";
	}
	
	
}
