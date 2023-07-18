package com.udla.modulo_servicios.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import com.udla.modulo_servicios.enums.*;

import lombok.*;

@Entity @Getter @Setter
public class Servicio extends EntidadBase {
	@ManyToOne
    @DescriptionsList(descriptionProperties="nombre")
	@Required
    Categoria categoria;
	
	@Enumerated(EnumType.STRING)
	@Required
	Clasificacion clasificacion;
	
	@ManyToOne
    @DescriptionsList(descriptionProperties="nombre")
	@Required
    Ambito ambito;

	@Enumerated(EnumType.STRING)
	@Required
	TipoDatacenter datacenter;
	
	@ManyToOne
    @DescriptionsList(descriptionProperties="nombre")
	@Required
    TipoServicio tipoServicio;
	
	@Column(length=50) @Required
    String areaFuncional;
	
	@Column(length=50) @Required
    String usuarioAdministrador;
	
	@Column(length=50)
    String tipoAccesoUsuarioAdmin;

	@DefaultValueCalculator(TrueCalculator.class)
    boolean activo;
	
    boolean propiedadIntelectual;
	
    boolean aplicacionExterna;
	
    boolean informacionCertificada;
    
    @Enumerated(EnumType.STRING)
    @Required
	Transaccionabilidad transaccionabilidad;
}
