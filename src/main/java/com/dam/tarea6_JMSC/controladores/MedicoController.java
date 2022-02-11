package com.dam.tarea6_JMSC.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dam.tarea6_JMSC.servicios.MedicoServiceI;

@Controller
public class MedicoController {
	
	@Autowired
	private MedicoServiceI medicoServiceI;

}
