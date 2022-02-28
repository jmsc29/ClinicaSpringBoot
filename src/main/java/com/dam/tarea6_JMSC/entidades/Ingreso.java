package com.dam.tarea6_JMSC.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ingresos")
@Data @AllArgsConstructor @NoArgsConstructor
public class Ingreso implements Serializable {
	
	

	public Ingreso(String numHabitacion, String cama, String fechaIngreso, Medico medico, Paciente paciente) {
		this.numHabitacion = numHabitacion;
		this.cama = cama;
		this.fechaIngreso = fechaIngreso;
		this.medico = medico;
		this.paciente = paciente;
	}

	public Ingreso(Long codigoIngreso) {
		this.codigoIngreso = codigoIngreso;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoIngreso;
	
	private String numHabitacion;
	
	private String cama;
	
	private String fechaIngreso;
	
	@JsonIgnoreProperties(value={"ingresos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "codigoMedico")
	private Medico medico;
	
	@JsonIgnoreProperties(value={"ingresos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "codigoPaciente")
	private Paciente paciente;

}
