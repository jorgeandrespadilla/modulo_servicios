package com.udla.modulo_servicios.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Ambito extends EntidadBase {
	@OneToMany(mappedBy="ambito")
    @ListProperties("nombre")
	@ReadOnly
    Collection<Servicio> servicios;
}
