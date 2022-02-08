package com.dam.tarea6_JMSC.servicios;

import java.util.List;

import com.dam.tarea6_JMSC.entidades.*;

public interface MedicoServiceI {
	
	public List<Medico> obtenerMedicos();
	
	public void insertarPaciente(Medico medico);

}
