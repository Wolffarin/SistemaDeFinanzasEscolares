package com.company;
import java.util.Scanner;

import java.util.ArrayList;

public class Estudiante {
    private Estudiante estudiante;
    private String IDestudiante;
    public int grado;
    private String Nombre;
    private double TotalPagos;
    private ArrayList<Double> pagosejecutados = new ArrayList<Double>();


    //METODOS
    public int getGrado() {
        return grado;
    }
    public void setGrado() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir)
        {
            int grado = sc.nextInt();
            if (grado <= 1)
            {
                System.out.println("imposible asignar un grado menor a uno");
            }else
            {
                if (grado > 6)
                {
                    System.out.println("el nivel mayor disponible es sexto grado");
                }else
                {
                    this.grado = grado;
                    salir = true;
                }
            }
        }


    }
    public String getIDestudiante() {
        return IDestudiante;
    }

    public void setIDestudiante(String iDestudiante) {
        this.IDestudiante = iDestudiante;}

    public Double getpagosejecutados(int indice) {
        return pagosejecutados.get(indice);
    }

    public int getPagosSize()
    {
        return pagosejecutados.size();
    }

    public void setPagosRealizados(ArrayList<Double> pagosRealizados) {
        this.pagosejecutados = pagosRealizados;

    }


    public int getTotalPagos() {
        return (int) TotalPagos;
    }

    public void setTotalDePagos(int totalPagado) {
        this.TotalPagos = totalPagado;
    }



    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }



   //pago final


    public  void agregarPago(double pago)
    {
        this.pagosejecutados.add(pago);
    }

}



