package com.dam.tarea6_JMSC.entidades;

import java.io.Serializable;
import java.util.Date;

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

@Entity
@Table(name = "ingresos")
public class Ingreso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoIngreso;
	
	private String numHabitacion;
	
	private String cama;
	
	@Temporal(TemporalType.DATE)
	private Date fechaIngreso;
	
	//@JsonIgnoreProperties(value={"ingresos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "codigoMedico")
	private Medico medico;
	
	//@JsonIgnoreProperties(value={"ingresos", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "codigoPaciente")
	private Paciente paciente;

}
