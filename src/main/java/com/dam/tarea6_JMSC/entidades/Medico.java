package com.dam.tarea6_JMSC.entidades;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "medicos")
@Data @AllArgsConstructor @NoArgsConstructor
public class Medico implements Serializable {

	public Medico(String nombre, String apellidos, String telefono, String especialidad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.especialidad = especialidad;
	}
	
	public Medico(Long codigoMedico) {
		this.codigoMedico = codigoMedico;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoMedico;

	private String nombre;

	private String apellidos;
	
	private String telefono;
	
	private String especialidad;
	
	@JsonIgnoreProperties(value={"medico", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medico", cascade = CascadeType.ALL)
	private List<Ingreso> ingresos;

}
