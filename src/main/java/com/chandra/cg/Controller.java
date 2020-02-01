package com.chandra.cg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/chandra")
public class Controller {

	    
	    @GetMapping({ "/details" })
	    public String getUpdatedSeat() {
	        return new String("WELCOME TO gcp");
	    }
	}
	

