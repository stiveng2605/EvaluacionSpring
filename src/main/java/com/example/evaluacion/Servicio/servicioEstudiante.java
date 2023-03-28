package com.example.evaluacion.Servicio;

import com.example.evaluacion.Entidad.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;

@Service
public class servicioEstudiante {
    ArrayList<Estudiante> estudiantes = new ArrayList<>();


    public servicioEstudiante(){
        estudiantes.add(new Estudiante(1,"Eider", "Guerrero",new String[]{"Español", "Matematicas","Ingles"},new Float[]{5.0f,4.0f,3.5f}));
        estudiantes.add(new Estudiante(2,"Patricia", "Acosta",new String[]{"Religion", "Ciencias Naturales","Español"},new Float[]{4.5f,3.5f,4.3f}));
        estudiantes.add(new Estudiante(3,"Daniel", "Cubillos",new String[]{"Matematicas", "Sociales","Musica"},new Float[]{3.8f,4.3f,3.7f}));
        estudiantes.add(new Estudiante(4,"Camilo", "Sanchez",new String[]{"Sociales", "Matematicas","Ingles"},new Float[]{4.6f,4.0f,4.5f}));
        estudiantes.add(new Estudiante(5,"Andres", "Rey",new String[]{"Español", "Ciencias Naturales","Religion"},new Float[]{4.8f,2.9f,3.5f}));
        estudiantes.add(new Estudiante(6,"Roberto", "Gomez",new String[]{"Ingles", "Musica","Emprendimiento"},new Float[]{2.5f,4.9f,3.5f}));
    }

    public ArrayList<Estudiante> listar(){
        return estudiantes;
    }

    public String agregarEstudiante(Estudiante estu){
        estudiantes.add(estu);
        return "Registro Exitoso";
    }

    public String eliminarEstudiante(String materia){
        String resp = "El Estudiante no se pudo borrar";
        Iterator<Estudiante> iter = estudiantes.iterator();
        while (iter.hasNext()) {
            Estudiante e = iter.next();
            if (e.getMaterias()[0].equals(materia) || e.getMaterias()[1].equals(materia) || e.getMaterias()[2].equals(materia)){
                iter.remove();
                resp = "Los estudiantes se borraron";
            }
        }
        return resp;
    }
}
