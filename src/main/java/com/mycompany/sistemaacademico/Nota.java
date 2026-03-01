/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;

/**
 *
 * @author angel
 */
public class Nota {
    private estudiante estudiate; //cambiar nombre de clase a "Estudiante" -> e = E
    private Asignatura asignatura;
    private double Valor;
    private String periodo;  
    
    public Nota(){}
    
    public Nota(estudiante estudiante, Asignatura asignatura, double valor, String periodo){
        this.estudiate = estudiante;
        this.asignatura = asignatura;
        this.Valor = valor;
        this.periodo = periodo;
    }

    public estudiante getEstudiate() {
        return estudiate;
    }

    public void setEstudiate(estudiante estudiate) {
        this.estudiate = estudiate;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Nota{" + "estudiate=" + estudiate + "\n" +
               ", asignatura=" + asignatura + "\n" +
               ", Valor=" + Valor + "\n" +
               ", periodo=" + periodo + '}';
    }
    
    
    
    
    
    
}
