package com.example.gestionAlumnos.controller;

import com.example.gestionAlumnos.domain.Alumno;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    private List<Alumno> alumnos = new ArrayList<>(Arrays.asList(

            new Alumno(1, "Edwin", "edwin@gmail.com", "Programacion"),
            new Alumno(2, "Maria", "maria@gmail.com", "Base de Datos"),
            new Alumno(3, "Carlos", "carlos@gmail.com", "Redes")

    ));
    @GetMapping
    public List<Alumno> getAlumnos() {
        return this.alumnos;
    }

    //Consultar alumno por email
    @GetMapping("/{email}")
    public Alumno getAlumno(@PathVariable String email){
        for (Alumno a : alumnos){
            if(a.getEmail().equalsIgnoreCase(email)){
                return a;
            }
        }
        return null;
    }

    //crear alumno
    @PostMapping
    public Alumno postAlumno(@RequestBody Alumno alumno){
        alumnos.add(alumno);
        return alumno;
    }

    //Actualizar cliente completamente
    @PutMapping
    public Alumno putAlumno(@RequestBody Alumno alumno){
        for(Alumno a: alumnos){
            if(a.getID() == alumno.getID()){
                
            }
        }
    }
}
