package com.mycompany.facultad2.logica;

import com.mycompany.facultad2.logica.Curso;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-21T11:33:19", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Profesor.class)
public class Profesor_ { 

    public static volatile SingularAttribute<Profesor, Integer> idProf;
    public static volatile ListAttribute<Profesor, Curso> cursosP;
    public static volatile SingularAttribute<Profesor, String> nombreProf;

}