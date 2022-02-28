package com.dam.tarea6_JMSC.servicios;

import java.util.List;
import java.util.Optional;
import com.dam.tarea6_JMSC.entidades.Paciente;

public interface PacienteServiceI{
	
public List<Paciente> obtenerPacientes();
	
	public void insertarPaciente(Paciente paciente);
	
	public void borrarPaciente(Long codigoPaciente);
	
	public Optional<Paciente> getOne(Long codigoPaciente);
	
	

}
