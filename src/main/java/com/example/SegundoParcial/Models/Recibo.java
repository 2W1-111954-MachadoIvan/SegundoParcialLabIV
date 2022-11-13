/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SegundoParcial.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ivanm
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "")

public class Recibo {
    @Id
    @GeneratedValue
    @Column ( name = "")
    private int nroRecibo;
    private int mes;
    private int anio;
    private double antiguedad;
    private double jubilacion;
    private double obraSocial;
    private double fondoComplejidad;
    
    @ManyToOne(targetEntity = Empleado.class)
    @JoinColumn(name = "legajo")
    @JsonBackReference
    private Empleado empleado;
    
}
