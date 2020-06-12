package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Escuela escuela = new Escuela();
        Estudiante estudiante = new Estudiante();
        Maestro maestro = new Maestro();
        MenuPrincipal menuPrincipal = new MenuPrincipal();


        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            MenuPrincipal.menuinicial();
            try {
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        boolean salir2 = false;
                        while (!salir2) {
                            menuPrincipal.menuMaestro();
                            try {
                                int opcion1 = sc.nextInt();
                                switch (opcion1) {
                                    case 1:
                                        maestro.master();
                                        break;
                                    case 2:
                                        estudiante.();
                                        break;
                                    case 3:
                                        cita.cancelarCita();
                                        break;
                                    case 4:
                                        salir2 = true;
                                        break;
                                    default:
                                        System.out.println(" numero valido por favor");
                                }
                            }catch (InputMismatchException e) { System.out.println(" numero valido por favor");sc.next();
                            } }break;
                    case 2:   boolean salir3 = false;
                        while (!salir3)
                        // menu de Diagnosticos obtenidos
                        {
                            menuPrincipal.menuEstudiante();
                            try {
                                int opcion2 = sc.nextInt();switch (opcion2) {
                                    case 1:
                                        escuela.();
                                        break;
                                    case 2:
                                        diagnostico.modificarDiagnostico();
                                        break;
                                    case 3:
                                        diagnostico.eliminarDiagnostico();
                                        break;
                                    case 4:
                                        salir3 = true;
                                        break;
                                    default:
                                        System.out.println("numero valido porfavor");
                                        break; } }
                            catch (InputMismatchException e) { System.out.println("numero valido por favor");sc.next();
                            } }
                        break;
                    case 3:
                        boolean salir4 = false;
                        while (!salir4) {
                            menu.menuReportes();
                            try { int opcion3 = sc.nextInt();
                                switch (opcion3) {
                                    case 1:
                                        cita.mostrarCitas();
                                        break;
                                    case 2:
                                        diagnostico.mostrarDiagnosticos();
                                        break;
                                    case 3:
                                        salir4 = true;
                                        break;
                                    default:
                                        System.out.println("Ingrese un numero valido");
                                        break;
                                } } catch (InputMismatchException e) {
                                System.out.println("Ingrese un numero valido");sc.next();
                            }
                        }
                        break;
                        case 4:
                            boolean salir5 = false;
                            while (!salir5) {
                                menuPrincipal.menuingresodedatos();
                                try { int opcion3 = sc.nextInt();
                                    switch (opcion3) {
                                        case 1:
                                            escuela.ingresarnuevoEstudiante();
                                            break;
                                        case 2:
                                            escuela.ingresarDocente();
                                            break;
                                        case 3:
                                            salir4 = true;
                                            break;
                                        default:
                                            System.out.println("Ingrese un numero valido");
                                            break;
                                    } } catch (InputMismatchException e) {
                                    System.out.println("Ingrese un numero valido");sc.next();




                            salir = true;
                        break; default:
                        break; } }catch(InputMismatchException e)
            {
                System.out.println("numero valido por favor");sc.next();

            }
        }


    }
}
