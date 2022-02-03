package com.dam.tarea6_JMSC.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.dam.tarea6_JMSC.entidades.Ingreso;

@Repository
public interface IngresoRepositorioI  extends JpaRepository<Ingreso, Long> {

}
