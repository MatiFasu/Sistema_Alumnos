package com.mycompany.facultad2.logica;

import com.mycompany.facultad2.logica.Alumno;
import com.mycompany.facultad2.logica.Calificacion;
import com.mycompany.facultad2.logica.Profesor;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-21T11:33:19", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, Integer> anotados;
    public static volatile SingularAttribute<Curso, Float> precio;
    public static volatile ListAttribute<Curso, Profesor> profesores;
    public static volatile ListAttribute<Curso, Alumno> alumnos;
    public static volatile ListAttribute<Curso, Calificacion> calificaciones;
    public static volatile SingularAttribute<Curso, Integer> id;
    public static volatile SingularAttribute<Curso, String> nombre;
    public static volatile SingularAttribute<Curso, Integer> cupo;

}