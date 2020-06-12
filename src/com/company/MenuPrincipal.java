package com.company;

public class MenuPrincipal {

    public static void menuinicial() {
        System.out.println("Escuela Junior Hight ");
        System.out.println("1. menu de Maestros");
        System.out.println("2. menu de alumnos");
        System.out.println("3. buscar informacion por ID")
        ;
        System.out.print("4.menu de la escuela");

        System.out.print("5.Estado de cuenta total Alumnos o maestros:");
        System.out.println("6. Salir ");

    }

    public static void menuMaestro() {
        System.out.println("PLanillas de MAestros ");
        System.out.println("1.Buscar Maestro ");
        System.out.println("3.Salir");

    }

    public static void menuEstudiante() {
        System.out.println("Estado de cuenta Estudiantes ");
        System.out.println("1.Buscar Estudiante ");
        System.out.println("2.Mostrar Todos Los Estudiantes");
        System.out.println("3.ingresar estudiante");
        System.out.println("4.Salir");
        System.out.print("Ingrese su Eleccion:");


    }

    public static void menuID() {
        System.out.println("Seleccione El tipo de ID ");
        System.out.println("1.ID de Maestros ");
        System.out.println("2.ID de Estudiante");
        System.out.println("3.ingresar ID");
        System.out.println("4.Salir");
        System.out.print("Ingrese su Eleccion:");
    }
    public static void menuingresodedatos() {
        System.out.println("ingresando datos ");
        System.out.println("1.ingresar Estudiante ");

        System.out.println("2.ingresar Docente");
        System.out.println("3.Salir");


}}