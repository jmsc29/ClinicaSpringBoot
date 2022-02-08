package com.dam.tarea6_JMSC.servicios;

import java.util.List;

import com.dam.tarea6_JMSC.entidades.Paciente;

public interface PacienteServiceI{
	
	public List<Paciente> obtenerPacientes();
	
	public void insertarPaciente(Paciente paciente);
	
	

}
