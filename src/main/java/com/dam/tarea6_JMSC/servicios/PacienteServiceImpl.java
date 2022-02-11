package com.dam.tarea6_JMSC.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dam.tarea6_JMSC.entidades.Paciente;
import com.dam.tarea6_JMSC.repositorios.PacienteRepositorioI;

@Service
public class PacienteServiceImpl implements PacienteServiceI {
	
	@Autowired
	private PacienteRepositorioI pacienteRepositorio;

	@Override
	public List<Paciente> obtenerPacientes() {
		return pacienteRepositorio.findAll();
	}

	@Override
	public void insertarPaciente(Paciente paciente) {
		pacienteRepositorio.save(paciente);
	}

}
