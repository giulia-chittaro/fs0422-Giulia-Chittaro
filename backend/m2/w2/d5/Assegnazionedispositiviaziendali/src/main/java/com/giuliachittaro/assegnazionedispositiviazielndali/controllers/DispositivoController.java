package com.giuliachittaro.assegnazionedispositiviazielndali.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.giuliachittaro.assegnazionedispositiviazielndali.entities.Dispositivo;
import com.giuliachittaro.assegnazionedispositiviazielndali.services.UtenteService;

@Controller
public class DispositivoController {
	
	@Autowired
	UtenteService us;
	

	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "Ciao sono l'Homepage";
	}
	
	
}
