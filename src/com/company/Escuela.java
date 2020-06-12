package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Escuela {

    private double egresos;
    private int Comp;
    private ArrayList<Salario> Pago;
    private ArrayList<Deducciones> Deudas;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private int neocomp = 1;
    private Object Estudiante;
    private ArrayList<Maestro> maestro = new ArrayList<>();
    private ArrayList<Double> ingresos = new ArrayList<Double>();
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public ArrayList<Maestro> getMaestro() {
        return maestro;
    }
    public void Pago(Salario sueldobase) {
        if (sueldobase.Getcantidad() < 0) {
            System.out.println("Salario no puede ser menor a Cero");
        } else {
            ingresos = ingresos ;
            Pago.add(sueldobase);
        }
    }

    public void Deudas(Deducciones sueldobase) {
        if (sueldobase.Getcantidad() < 0) {
            System.out.println("si no tiene egresos estos no pueden ser menor a Cero");
        } else {
            ingresos = ingresos  ;
            Deudas.add(sueldobase);
        }
    }

    private ArrayList<Deducciones> Deudas() {
        return Deudas;
    }

    public void setMaestros(ArrayList<Maestro> maestros) {
        this.maestro = maestro;
    }


    private Estudiante estudiante;
    public String Escuela() {
        int ingresos = 0;
        Pago = new ArrayList<>();
        Deudas = new ArrayList<>();
        egresos = 0;





        public String GeneradordeID Object estudiante1 = Estudiante;
        estudiante)
    {
        String id = "ESTUD"+estudiante.getGrado() + Comp;
        return id;
    }
    public String generarIDDocente();
    {
        String id = "Master"+ neocomp;
        neocomp++;
        return id;
    }

    public void ingresarnuevoEstudiante()
    {
        Scanner sc = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        System.out.println("Ingresae el nombre:");
        String nombre = sc.nextLine();
        estudiante.setNombre(nombre);
        System.out.println("Ingrese el grado perteneciente:");
        estudiante.setGrado();
        estudiante.setIDestudiante(GeneradordeID(estudiante1));
        System.out.println("se ha registrado con el siguiente ID: " + estudiante.getIDestudiante());
        ingresarnuevoEstudiante().add(estudiante);
        Comp++;

    }


    }
}

    private String GeneradordeID(Object estudiante) {
        String id = "ESTUD"+estudiante.getClass() + Comp;
        return id;
    }

    Collection<com.company.Estudiante> ingresarnuevoEstudiante() {
        return null;
    }




    public void ingresarDocente() {
        Scanner sc = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        System.out.println("Ingresae el nombre:");
        String nombre = sc.nextLine();
        estudiante.setNombre(nombre);
        System.out.println("Ingrese el Salario Perteneciente:");
        double ingreso = It.obtenerDoubleValidado("Ingrese un numero");
        maestro.master(ingreso);
        maestro.setId(generarIDMaestro());
        System.out.println("Maestro ingresado con ID: "+ maestro.getId());
        maestros.add(maestro);
    }
}
    }

    private class Nombre {
    }




