package com.dam.tarea6_JMSC.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dam.tarea6_JMSC.entidades.*;
import com.dam.tarea6_JMSC.repositorios.*;

@Service
public class MedicoServiceImpl implements MedicoServiceI {
	
	@Autowired
	private MedicoRepositorioI medicoRepositorio;

	@Override
	public List<Medico> obtenerMedicos() {
		return medicoRepositorio.findAll();
	}

	@Override
	public void insertarMedico(Medico medico) {
		medicoRepositorio.save(medico);
	}

}
