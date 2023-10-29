
package com.mycompany.facultad2.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Profesor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idProf;
    private String nombreProf;
    @ManyToMany
    @JoinTable(name = "prof_curso",
               joinColumns = @JoinColumn(name = "prof_id"),
               inverseJoinColumns = @JoinColumn(name = "curso_id"))
    private List<Curso> cursosP;
    
    public Profesor() {
    }

    public Profesor(int idProf, String nombreProf, List<Curso> cursosP) {
        this.idProf = idProf;
        this.nombreProf = nombreProf;
        this.cursosP = cursosP;
    }

    public int getIdProf() {
        return idProf;
    }

    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }

    public String getNombreProf() {
        return nombreProf;
    }

    public void setNombreProf(String nombreProf) {
        this.nombreProf = nombreProf;
    }

    public List<Curso> getCursosP() {
        return cursosP;
    }

    public void setCursosP(List<Curso> cursosP) {
        this.cursosP = cursosP;
    }

    
    
    
}
