package com.company;

import java.util.Random;

public class Maestro {
    private Maestro maestro;
    private String nombre;
    private String IDMaestro;
    private double salario;

    int corr = 1;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return IDMaestro;
    }

    public void setId(String IDMaestro) {
        this.IDMaestro = IDMaestro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        boolean salir = false;
        while(!salir)
        {
            if (salario < 0)
            {
                System.out.println("No puede Salir sin salario");
            }else{
                this.salario = salario;
                salir = true;
            }
        }

    }




}
