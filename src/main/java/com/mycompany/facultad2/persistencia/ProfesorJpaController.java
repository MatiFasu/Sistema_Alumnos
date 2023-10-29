/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facultad2.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.facultad2.logica.Curso;
import com.mycompany.facultad2.logica.Profesor;
import com.mycompany.facultad2.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author matia
 */
public class ProfesorJpaController implements Serializable {

    public ProfesorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public ProfesorJpaController() {
        emf = Persistence.createEntityManagerFactory("facultad2PU");
    }
    
    public void create(Profesor profesor) {
        if (profesor.getCursosP() == null) {
            profesor.setCursosP(new ArrayList<Curso>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Curso> attachedCursosP = new ArrayList<Curso>();
            for (Curso cursosPCursoToAttach : profesor.getCursosP()) {
                cursosPCursoToAttach = em.getReference(cursosPCursoToAttach.getClass(), cursosPCursoToAttach.getId());
                attachedCursosP.add(cursosPCursoToAttach);
            }
            profesor.setCursosP(attachedCursosP);
            em.persist(profesor);
            for (Curso cursosPCurso : profesor.getCursosP()) {
                cursosPCurso.getProfesores().add(profesor);
                cursosPCurso = em.merge(cursosPCurso);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Profesor profesor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Profesor persistentProfesor = em.find(Profesor.class, profesor.getIdProf());
            List<Curso> cursosPOld = persistentProfesor.getCursosP();
            List<Curso> cursosPNew = profesor.getCursosP();
            List<Curso> attachedCursosPNew = new ArrayList<Curso>();
            for (Curso cursosPNewCursoToAttach : cursosPNew) {
                cursosPNewCursoToAttach = em.getReference(cursosPNewCursoToAttach.getClass(), cursosPNewCursoToAttach.getId());
                attachedCursosPNew.add(cursosPNewCursoToAttach);
            }
            cursosPNew = attachedCursosPNew;
            profesor.setCursosP(cursosPNew);
            profesor = em.merge(profesor);
            for (Curso cursosPOldCurso : cursosPOld) {
                if (!cursosPNew.contains(cursosPOldCurso)) {
                    cursosPOldCurso.getProfesores().remove(profesor);
                    cursosPOldCurso = em.merge(cursosPOldCurso);
                }
            }
            for (Curso cursosPNewCurso : cursosPNew) {
                if (!cursosPOld.contains(cursosPNewCurso)) {
                    cursosPNewCurso.getProfesores().add(profesor);
                    cursosPNewCurso = em.merge(cursosPNewCurso);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = profesor.getIdProf();
                if (findProfesor(id) == null) {
                    throw new NonexistentEntityException("The profesor with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Profesor profesor;
            try {
                profesor = em.getReference(Profesor.class, id);
                profesor.getIdProf();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The profesor with id " + id + " no longer exists.", enfe);
            }
            List<Curso> cursosP = profesor.getCursosP();
            for (Curso cursosPCurso : cursosP) {
                cursosPCurso.getProfesores().remove(profesor);
                cursosPCurso = em.merge(cursosPCurso);
            }
            em.remove(profesor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Profesor> findProfesorEntities() {
        return findProfesorEntities(true, -1, -1);
    }

    public List<Profesor> findProfesorEntities(int maxResults, int firstResult) {
        return findProfesorEntities(false, maxResults, firstResult);
    }

    private List<Profesor> findProfesorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Profesor.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Profesor findProfesor(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Profesor.class, id);
        } finally {
            em.close();
        }
    }

    public int getProfesorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Profesor> rt = cq.from(Profesor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
