package com.example.gestionAlumnos.domain;

public class Alumno {
    private int id;
    private String nombre;
    private String email;
    private String curso;


    //Constructor
    public Alumno (int id, String nombre, String email, String curso){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.curso = curso;
    }
    //getters
    public int getID(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEmail (){
        return email;
    }
    public String getCurso(){
        return curso;
    }
    //Setters
    public void  setId (int id){
        this.id=id;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setCurso(String curso){
        this.curso=curso;
    }
}
