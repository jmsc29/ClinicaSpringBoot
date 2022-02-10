package com.dam.tarea6_JMSC.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dam.tarea6_JMSC.entidades.Ingreso;
import com.dam.tarea6_JMSC.entidades.Paciente;
import com.dam.tarea6_JMSC.repositorios.IngresoRepositorioI;
import com.dam.tarea6_JMSC.repositorios.MedicoRepositorioI;

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
	public List<Ingreso> ingresoDePaciente(Long codigoPaciente) {
		return ingresoRepositorio.findByIdCodigoPaciente(codigoPaciente);
	}

	@Override
	public List<Ingreso> ingresoDeMedico(Long codigoMedico) {
		return ingresoRepositorio.findByIdCodigoMedico(codigoMedico);
	}

	@Override
	public void eliminarIngresoPaciente(Long codigoPaciente) {
		ingresoRepositorio.deleteById(codigoPaciente);
	}
	
}
