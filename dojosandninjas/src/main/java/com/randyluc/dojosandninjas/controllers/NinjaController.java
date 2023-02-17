package com.randyluc.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.randyluc.dojosandninjas.models.Dojo;
import com.randyluc.dojosandninjas.models.Ninja;
import com.randyluc.dojosandninjas.services.NinjaService;

@Controller
@RequestMapping("/ninja")
public class NinjaController {
	@Autowired
	private NinjaService ninservice;
	
	@GetMapping("new")
	public String addNinja(@ModelAttribute("ninja")Ninja ninja,Model viewModel) {
		List<Dojo>allDojos = this.ninservice.allDojos();
		viewModel.addAttribute("allDojos",allDojos);
		return "NewNinja.jsp";
	}
	
	@PostMapping("/createNinja")
	public String createNinja (@Valid @ModelAttribute ("ninja")Ninja ninja, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			List<Dojo>allDojos=this.ninservice.allDojos();
			viewModel.addAttribute("allDojos",allDojos);
			return "NewNinja.jsp";
		}
		this.ninservice.createNinja(ninja);
		return "redirect:/dojo/"+ninja.getDojo().getId();
	}
}
