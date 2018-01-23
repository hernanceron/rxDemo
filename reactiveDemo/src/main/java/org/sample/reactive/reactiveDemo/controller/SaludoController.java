package org.sample.reactive.reactiveDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
	@RequestMapping("/saludo")
	public String saludar(){
		return "Hola Mundo";
	}
}
