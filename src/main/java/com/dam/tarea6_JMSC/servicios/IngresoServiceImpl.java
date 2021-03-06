package com.dam.tarea6_JMSC.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dam.tarea6_JMSC.entidades.Ingreso;
import com.dam.tarea6_JMSC.entidades.Medico;
import com.dam.tarea6_JMSC.entidades.Paciente;
import com.dam.tarea6_JMSC.repositorios.IngresoRepositorioI;

@Service
@Transactional
public class IngresoServiceImpl implements IngresoServiceI {
	
	@Autowired
	private IngresoRepositorioI ingresoRepositorio;

	@Override
	public List<Ingreso> obtenerIngresos() {
		return ingresoRepositorio.findAll();
	}

	@Override
	public void insertarIngreso(Ingreso ingreso) {
		ingresoRepositorio.save(ingreso);
	}

	@Override
	public List<Ingreso> ingresoDePaciente(Paciente paciente) {
		return ingresoRepositorio.findByPaciente(paciente);
	}

	@Override
	public List<Ingreso> ingresoDeMedico(Medico medico) {
		return ingresoRepositorio.findByMedico(medico);
	}

	@Override
	public void borrarIngreso(Long codigoIngreso) {
		ingresoRepositorio.deleteById(codigoIngreso);
	}
	
	@Override
	public Optional<Ingreso> getOne(Long codigoIngreso) {
		return ingresoRepositorio.findById(codigoIngreso);
	}
	
}
