
package com.mycompany.sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    
        static ArrayList <estudiante> estudiantes= new ArrayList<>();
        static ArrayList <Asignatura> Asignaturas= new ArrayList<>();
        static ArrayList <Nota> notas= new ArrayList<>();
        static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        mostrarMenu();
    }
    
    public static void mostrarMenu() {

        Scanner sc = new Scanner(System.in);
        int opcionPrincipal;
        int opcionSecundaria;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Estudiantes");
            System.out.println("2. Asignaturas");
            System.out.println("3. Notas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcionPrincipal = sc.nextInt();

            switch (opcionPrincipal) {

                case 1:
                    do {
                        System.out.println("\n--- MENU ESTUDIANTE ---");
                        System.out.println("1. Crear");
                        System.out.println("2. Listar");
                        System.out.println("3. Buscar");
                        System.out.println("4. Actualizar");
                        System.out.println("5. Eliminar");
                        System.out.println("6. Volver");
                        System.out.print("Seleccione una opcion: ");
                        opcionSecundaria = sc.nextInt();

                        switch (opcionSecundaria) {
                            case 1:
                                System.out.println("Crear estudiante...");
                                break;
                            case 2:
                                System.out.println("Listar estudiantes...");
                                break;
                            case 3:
                                System.out.println("Buscar estudiante...");
                                break;
                            case 4:
                                System.out.println("Actualizar estudiante...");
                                break;
                            case 5:
                                System.out.println("Eliminar estudiante...");
                                break;
                            case 6:
                                System.out.println("Volviendo al menu principal...");
                                break;
                            default:
                                System.out.println("Opcion invalida.");
                        }

                    } while (opcionSecundaria != 6);
                    break;

                case 2:
                    do {
                        System.out.println("\n--- MENU ASIGNATURA ---");
                        System.out.println("1. Crear");
                        System.out.println("2. Listar");
                        System.out.println("3. Buscar");
                        System.out.println("4. Actualizar");
                        System.out.println("5. Eliminar");
                        System.out.println("6. Volver");
                        System.out.print("Seleccione una opcion: ");
                        opcionSecundaria = sc.nextInt();

                        switch (opcionSecundaria) {
                            case 1:
                                System.out.println("Crear asignatura...");
                                break;
                            case 2:
                                System.out.println("Listar asignaturas...");
                                break;
                            case 3:
                                System.out.println("Buscar asignatura...");
                                break;
                            case 4:
                                System.out.println("Actualizar asignatura...");
                                break;
                            case 5:
                                System.out.println("Eliminar asignatura...");
                                break;
                            case 6:
                                System.out.println("Volviendo al menu principal...");
                                break;
                            default:
                                System.out.println("Opcion invalida.");
                        }

                    } while (opcionSecundaria != 6);
                    break;

                case 3:
                    do {
                        System.out.println("\n--- MENU NOTA ---");
                        System.out.println("1. Registrar");
                        System.out.println("2. Listar");
                        System.out.println("3. Buscar");
                        System.out.println("4. Actualizar");
                        System.out.println("5. Eliminar");
                        System.out.println("6. Volver");
                        System.out.print("Seleccione una opcion: ");
                        opcionSecundaria = sc.nextInt();

                        switch (opcionSecundaria) {
                            case 1:
                                System.out.println("Registrar nota...");
                                break;
                            case 2:
                                System.out.println("Listar notas...");
                                break;
                            case 3:
                                System.out.println("Buscar nota...");
                                break;
                            case 4:
                                System.out.println("Actualizar nota...");
                                break;
                            case 5:
                                System.out.println("Eliminar nota...");
                                break;
                            case 6:
                                System.out.println("Volviendo al menu principal...");
                                break;
                            default:
                                System.out.println("Opcion invalida.");
                        }

                    } while (opcionSecundaria != 6);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcionPrincipal != 4);

        sc.close();
    }
    
}
