package com.dam.tarea6_JMSC.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pacientes")
@Data @AllArgsConstructor @NoArgsConstructor
public class Paciente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoPaciente;
	
	private String nombre;
	
	private String apellidos;
	
	private String direccion;
	
	private String poblacion;
	
	private String provincia;
	
	private String codigoPostal;
	
	private String telefono;
	
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@JsonIgnoreProperties(value={"medico", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paciente", cascade = CascadeType.ALL)
	private List<Ingreso> ingresos;

}
