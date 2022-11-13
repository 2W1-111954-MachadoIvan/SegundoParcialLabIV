/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SegundoParcial.Repositories;

import com.example.SegundoParcial.Models.Recibo;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ivanm
 */
public class EmpleadoRepositoryJPA implements EmpleadoRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void createRecibo(Recibo recibo) {
        
    }
    
}
