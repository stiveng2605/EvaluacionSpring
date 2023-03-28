package com.example.evaluacion.Controlador;
import com.example.evaluacion.Entidad.Estudiante;
import com.example.evaluacion.Servicio.servicioEstudiante;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class controladorEstudiante {

    servicioEstudiante servicio= new servicioEstudiante();

    @GetMapping("/listarEstudiantes")
    public ArrayList<Estudiante> listarUsuarios(){
        return servicio.listar();
    }

    @DeleteMapping("/eliminarEstudiante/{materia}")
    public String eliminarEstudiante(@PathVariable("materia") String materia) {
        return servicio.eliminarEstudiante(materia);
    }

    @PostMapping("/agregarEstudiante")
    public String agregar(@RequestBody Estudiante estu){
        return servicio.agregarEstudiante(estu);
    }
}
