package com.dam.tarea6_JMSC.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dam.tarea6_JMSC.entidades.*;
import com.dam.tarea6_JMSC.repositorios.*;

@Service
@Transactional
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
	
	public void borrarMedico(Long codigoMedico){
		medicoRepositorio.deleteById(codigoMedico);
    }

	@Override
	public Optional<Medico> getOne(Long codigoMedico) {
		return medicoRepositorio.findById(codigoMedico);
	}
	
	

}
