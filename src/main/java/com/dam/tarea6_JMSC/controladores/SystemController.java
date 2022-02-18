package com.dam.tarea6_JMSC.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("*")
public class SystemController {
	
	
		@GetMapping("/nombre")
		public String mostrarNombre() {
			return "Este es el título de la clínica";
		}

}
