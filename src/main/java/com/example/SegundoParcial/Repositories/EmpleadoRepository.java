/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SegundoParcial.Repositories;

import com.example.SegundoParcial.Models.Empleado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ivanm
 */
@Repository
public class EmpleadoRepository {
    
    @PersistenceContext
    private EntityManager em;
    
    
    public List<Empleado> obtenerEmpleados(){
        return em.createQuery("select e from Empleado e", Empleado.class).getResultList();
    }
    
    public void crearEmpleado(Empleado empleado) throws Exception{
        try{
            em.persist(empleado);
        } catch (Exception e){
            throw new Exception(e);
        }
    }
    
    
    
}
