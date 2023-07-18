package com.udla.modulo_servicios.modelo;

import java.time.*;

import javax.persistence.*;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@MappedSuperclass
@Getter @Setter
public abstract class EntidadBase {

   @Id 
   @Hidden
   @GeneratedValue(generator="system-uuid")
   @GenericGenerator(name="system-uuid", strategy = "uuid")
   @Column(length=32)
   String id;
   
   @Column(length=100) @Required
   String nombre;

   @TextArea
   String descripcion;
   
   @Required
   @ReadOnly
   @DefaultValueCalculator(CurrentLocalDateCalculator.class)
   LocalDate fechaCreacion;
   
}
