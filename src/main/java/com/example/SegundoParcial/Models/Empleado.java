/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SegundoParcial.Models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Date;
import java.util.List;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ivanmachado
 */
@Setter
@Getter 
public class Empleado {
    private int legajo;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Date fechaIngreso;
    private String area;
    private double sueldoBruto;
    
    @OneToMany(targetEntity = Recibo.class, mappedBy = "empleado")
    @JsonManagedReference    
    private List<Recibo> recibos;
    
}
