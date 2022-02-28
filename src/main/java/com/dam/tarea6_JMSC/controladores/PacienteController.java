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
import com.dam.tarea6_JMSC.servicios.PacienteServiceImpl;

import org.apache.commons.lang3.StringUtils;

@RestController
@RequestMapping("/pacientes")
@CrossOrigin(origins = "http://localhost:4200")
public class PacienteController {
	
	@Autowired
	private PacienteServiceImpl pacienteService;
	
	@GetMapping("")
	public ResponseEntity<List<Paciente>> list(){
		List<Paciente> list = pacienteService.obtenerPacientes();
		
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@PostMapping("/insertar")
    public ResponseEntity<?> create(@RequestBody Paciente paciente){
		if(StringUtils.isBlank(paciente.getNombre())) {
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
		}
		Paciente m = new Paciente(null, paciente.getNombre(), paciente.getApellidos(), paciente.getDireccion(), paciente.getPoblacion(), paciente.getProvincia(), paciente.getCodigoPostal(), paciente.getTelefono(), paciente.getFechaNacimiento(), null);
        pacienteService.insertarPaciente(m);
        return new ResponseEntity(m, HttpStatus.OK);
    }
	
	@DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")Long id){
        pacienteService.borrarPaciente(id);
        return new ResponseEntity(new Mensaje("Paciente eliminado"), HttpStatus.OK);
    }
	
	@GetMapping("/detalle/{id}")
	public ResponseEntity<Paciente> getByCodigoPaciente(@PathVariable("id")Long id){
		Paciente m = pacienteService.getOne(id).get();
		return new ResponseEntity(m, HttpStatus.OK);
	}
	
	@PutMapping("/actualizar/{id}")
    public ResponseEntity<?> update(@PathVariable("id")Long id, @RequestBody Paciente paciente){
		Paciente m = pacienteService.getOne(id).get();
        m.setNombre(paciente.getNombre());
        m.setApellidos(paciente.getApellidos());
        m.setDireccion(paciente.getDireccion());
        m.setPoblacion(paciente.getPoblacion());
        m.setProvincia(paciente.getProvincia());
        m.setCodigoPostal(paciente.getCodigoPostal());
        m.setTelefono(paciente.getTelefono());
        m.setFechaNacimiento(paciente.getFechaNacimiento());
        pacienteService.insertarPaciente(m);
        return new ResponseEntity(m, HttpStatus.OK);
    }
	
	
}
