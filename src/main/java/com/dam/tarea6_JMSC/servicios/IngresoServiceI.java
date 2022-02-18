package com.dam.tarea6_JMSC.servicios;

import java.util.List;

import com.dam.tarea6_JMSC.entidades.*;

public interface IngresoServiceI {
	
	public List<Ingreso> obtenerIngresos();
	
	public void insertarIngreso(Ingreso ingreso);
	
	public List<Ingreso> ingresoDePaciente(Paciente paciente);
	
	public List<Ingreso> ingresoDeMedico(Medico medico);
	
	public void eliminarIngresoPaciente(Paciente paciente);
	


}
