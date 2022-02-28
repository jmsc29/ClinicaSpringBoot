package com.dam.tarea6_JMSC.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dam.tarea6_JMSC.entidades.Paciente;
import com.dam.tarea6_JMSC.repositorios.PacienteRepositorioI;

@Service
@Transactional
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
	
	public void borrarPaciente(Long codigoPaciente){
		pacienteRepositorio.deleteById(codigoPaciente);
    }

	@Override
	public Optional<Paciente> getOne(Long codigoPaciente) {
		return pacienteRepositorio.findById(codigoPaciente);
	}

}
