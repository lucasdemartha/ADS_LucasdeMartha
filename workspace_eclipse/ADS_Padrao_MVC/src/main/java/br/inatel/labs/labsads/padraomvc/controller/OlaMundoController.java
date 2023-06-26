package br.inatel.labs.labsads.padraomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaMundoController {

	@GetMapping("/ola")
	public String getOla() {
		
		model.addAttribute("usuario", "Lucas");
		
		return "ola-mundo";
	}
	
}
