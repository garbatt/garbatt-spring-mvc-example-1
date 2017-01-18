package com.garbatt.mvc.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.garbatt.mvc.service.IceCreamFlavorsImpl;


@Controller
public class IceCreamController {
	
	// SEE https://www.genuitec.com/spring-frameworkrestcontroller-vs-controller/
	// Later version have @RestController... then no need for @ResponseBody
	// Test: http://localhost:8080/com.garbatt.mvc/icecreamflavors
	
	@RequestMapping(value = "/icecreamflavors", method = RequestMethod.GET, produces = "application/xml")
    public @ResponseBody IceCreamFlavorsImpl flavorRequest() {
        return new IceCreamFlavorsImpl();
    }
}
