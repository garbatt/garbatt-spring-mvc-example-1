package com.garbatt.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.garbatt.mvc.service.CombinationsImpl;

@Controller
public class CombinationController {
	@RequestMapping("/permutations")
    public String permutationsForm(Model model) {
    	CombinationsImpl cmb = new CombinationsImpl();
        model.addAttribute("combinations", cmb);
        return "permutations";
    }
		 
	 @RequestMapping(value="/permutations", method=RequestMethod.POST)
	 public String permutationsSubmit(@ModelAttribute CombinationsImpl dog, Model model) {
	    	//permutations.startPermutation();
	    	dog.permute();
	    	model.addAttribute("combinations", dog);
	    	
	        return "permresult";
	    }	
	
}
