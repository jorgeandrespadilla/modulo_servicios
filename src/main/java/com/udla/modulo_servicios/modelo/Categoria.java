package com.udla.modulo_servicios.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Categoria extends EntidadBase {
	@OneToMany(mappedBy="categoria")
    @ListProperties("nombre")
	@ReadOnly
    Collection<Servicio> servicios;
}
