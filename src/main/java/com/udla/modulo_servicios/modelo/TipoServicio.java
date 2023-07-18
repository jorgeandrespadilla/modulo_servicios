package com.udla.modulo_servicios.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class TipoServicio extends EntidadBase {
	@OneToMany(mappedBy="tipoServicio")
    @ListProperties("nombre")
	@ReadOnly
    Collection<Servicio> servicios;
}
