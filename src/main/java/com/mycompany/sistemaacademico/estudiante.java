
package com.mycompany.sistemaacademico;


public class estudiante {
    private String codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private int semestre;

    public estudiante() {
    }

    public estudiante(String codigo, String nombre, String apellido, int edad, int semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.semestre = semestre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    @Override
    public String toString() {
    return "Codigo: " + codigo + "\n" +
           "Nombre: " + nombre + "\n" +
           "Apellido: " + apellido + "\n" +
           "Edad: " + edad + "\n" +
           "Semestre: " + semestre + "\n";
        }
    }
