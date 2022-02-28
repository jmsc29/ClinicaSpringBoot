package com.dam.tarea6_JMSC.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dam.tarea6_JMSC.entidades.*;
import com.dam.tarea6_JMSC.servicios.IngresoServiceImpl;
import com.dam.tarea6_JMSC.servicios.MedicoServiceI;
import com.dam.tarea6_JMSC.servicios.MedicoServiceImpl;
import com.dam.tarea6_JMSC.servicios.PacienteServiceImpl;

import org.apache.commons.lang3.StringUtils;

@RestController
@RequestMapping("/ingresos")
@CrossOrigin(origins = "http://localhost:4200")
public class IngresoController {
	
	@Autowired
	private MedicoServiceImpl medicoService;
	
	@Autowired
	private PacienteServiceImpl pacienteService;
	
	@Autowired
	private IngresoServiceImpl ingresoService;
	
	@GetMapping("")
	public ResponseEntity<List<Ingreso>> list(){
		List<Ingreso> list = ingresoService.obtenerIngresos();
		
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@GetMapping("/ingresosMedico/{id}")
	public ResponseEntity<List<Ingreso>> listIngresosMedicos(@PathVariable("id")Long id){
		Medico medico = new Medico(id);
		List<Ingreso> list = ingresoService.ingresoDeMedico(medico);
		
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@GetMapping("/ingresosPaciente/{id}")
	public ResponseEntity<List<Ingreso>> listIngresosPacientes(@PathVariable("id")Long id){
		Paciente paciente = new Paciente(id);
		List<Ingreso> list = ingresoService.ingresoDePaciente(paciente);
		
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@PostMapping("/insertar")
    public ResponseEntity<?> create(@RequestBody Ingreso ingreso){
        Ingreso m = new Ingreso(null, ingreso.getNumHabitacion(), ingreso.getCama(), ingreso.getFechaIngreso(), ingreso.getMedico(), ingreso.getPaciente());
        ingresoService.insertarIngreso(m);
        return new ResponseEntity(m, HttpStatus.OK);
    }
	
	@DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")Long id){
		ingresoService.borrarIngreso(id);
        return new ResponseEntity(new Mensaje("Ingreso eliminado"), HttpStatus.OK);
    }
	
	
}
