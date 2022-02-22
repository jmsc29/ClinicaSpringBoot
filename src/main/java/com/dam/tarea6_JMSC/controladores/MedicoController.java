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
import com.dam.tarea6_JMSC.servicios.MedicoServiceI;
import com.dam.tarea6_JMSC.servicios.MedicoServiceImpl;
import org.apache.commons.lang3.StringUtils;

@RestController
@RequestMapping("/medicos")
@CrossOrigin(origins = "http://localhost:4200")
public class MedicoController {
	
	@Autowired
	private MedicoServiceImpl medicoService;
	
	@GetMapping("")
	public ResponseEntity<List<Medico>> list(){
		List<Medico> list = medicoService.obtenerMedicos();
		
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@PostMapping("/insertar")
    public ResponseEntity<?> create(@RequestBody Medico medico){
		if(StringUtils.isBlank(medico.getNombre())) {
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
		}
        Medico m = new Medico(null, medico.getNombre(), medico.getApellidos(), medico.getTelefono(), medico.getEspecialidad(), null);
        medicoService.insertarMedico(m);
        return new ResponseEntity(m, HttpStatus.OK);
    }
	
	@DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")Long id){
        medicoService.borrarMedico(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }
	
	@GetMapping("/detalle/{id}")
    public ResponseEntity<Medico> getById(@PathVariable("id") Long id){
        Medico m = medicoService.getOne(id).get();
        return new ResponseEntity(m, HttpStatus.OK);
    }
	
	@PutMapping("/actualizar/{id}")
    public ResponseEntity<?> update(@PathVariable("id")Long id, @RequestBody Medico medico){
        Medico m = medicoService.getOne(id).get();
        m.setNombre(medico.getNombre());
        m.setApellidos(medico.getApellidos());
        m.setTelefono(medico.getTelefono());
        m.setEspecialidad(medico.getEspecialidad());
        medicoService.insertarMedico(m);
        return new ResponseEntity(m, HttpStatus.OK);
    }
	
	
}
