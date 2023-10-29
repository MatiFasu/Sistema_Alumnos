package com.mycompany.facultad2.logica;

import com.mycompany.facultad2.logica.Calificacion;
import com.mycompany.facultad2.logica.Curso;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-21T11:33:19", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile ListAttribute<Alumno, Curso> cursos;
    public static volatile ListAttribute<Alumno, Calificacion> calificaciones;
    public static volatile SingularAttribute<Alumno, Integer> id;
    public static volatile SingularAttribute<Alumno, String> nombre;

}