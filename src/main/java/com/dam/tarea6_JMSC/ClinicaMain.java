package com.dam.tarea6_JMSC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.CollectionUtils;

import com.dam.tarea6_JMSC.entidades.Medico;
import com.dam.tarea6_JMSC.servicios.MedicoServiceI;

@SpringBootApplication
public class ClinicaMain implements CommandLineRunner{
	
	@Autowired
	private MedicoServiceI medicoService;

	public static void main(String[] args) {
		SpringApplication.run(ClinicaMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("------------------------------");
		
		final List<Medico> MedicosList = medicoService.obtenerMedicos();
		if(!CollectionUtils.isEmpty(MedicosList)) {
			for (Medico medico : MedicosList) {
				System.out.println(medico.toString());
			}
		}
		
		System.out.println("------------------------------");
		
	}

}
