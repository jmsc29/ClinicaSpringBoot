package com.dam.tarea6_JMSC.servicios;

import java.util.List;
import java.util.Optional;

import com.dam.tarea6_JMSC.entidades.*;

public interface MedicoServiceI {
	
	public List<Medico> obtenerMedicos();
	
	public void insertarMedico(Medico medico);
	
	public void borrarMedico(Long codigoMedico);
	
	public Optional<Medico> getOne(Long codigoMedico);

}
