package com.example.SegundoParcial.Controllers;

import com.example.SegundoParcial.Models.Empleado;
import com.example.SegundoParcial.Repositories.EmpleadoRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ivanm
 */

@RestController
@RequestMapping("/empleados")
public class EmpleadoController{
    
    @Autowired
    EmpleadoRepository repo;
    
    @PutMapping("/crear")
    @Transactional
    public String crearEmpleado(@RequestBody Empleado empleado) throws Exception{
        repo.crearEmpleado(empleado);
        return "El empleado fue creado correctamente";
    }    
    
}
