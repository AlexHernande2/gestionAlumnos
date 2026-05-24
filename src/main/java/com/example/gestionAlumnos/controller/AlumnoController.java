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
                a.setNombre(alumno.getNombre());
                a.setEmail(alumno.getEmail());
                a.setCurso(alumno.getCurso());

                return a;
            }
        }
        return null;
    }

    //actualizar un campo en especifico
    @PatchMapping
    public Alumno patchAlumno (@RequestBody Alumno alumno ){
        for(Alumno b : alumnos){
            if(b.getID() == alumno.getID()){
                if(alumno.getNombre() != null){
                    b.setNombre(alumno.getNombre());
                }
                if(alumno.getEmail() != null){
                    b.setEmail(alumno.getEmail());
                }
                if (alumno.getCurso() != null) {
                    b.setCurso(alumno.getCurso());
                }
                return b;
            }
        }
        return null;
    }
    //elimianr Alumno

    @DeleteMapping ("/{id}")
    public  Alumno deleteAlumno(@PathVariable int id){
        for (Alumno g: alumnos){
            if (g.getID() == id){
               alumnos.remove(g);
               return g;
            }
        }
        return null;
    }
}
