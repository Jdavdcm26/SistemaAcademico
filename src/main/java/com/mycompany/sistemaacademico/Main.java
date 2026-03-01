
package com.mycompany.sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    
        static ArrayList <estudiante> estudiantes= new ArrayList<>();
        static ArrayList <Asignatura> asignaturas= new ArrayList<>();
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
                                registrarEstudiante();
                                break;
                            case 2:
                                listarEstudiantes();
                                break;
                            case 3:
                                buscarEstudiante();
                                break;
                            case 4:
                                actualizarEstudiante();
                                break;
                            case 5:
                                eliminarEstudiante();
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
                                registrarAsignatura();
                                break;
                            case 2:
                                listarAsignaturas();
                                break;
                            case 3:
                                buscarAsignatura();
                                break;
                            case 4:
                                actualizarAsignatura();
                                break;
                            case 5:
                                eliminarAsignatura();
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
        public static void registrarEstudiante() {
    System.out.println("\n--- REGISTRAR ESTUDIANTE ---");

    System.out.print("ID: ");
    String id = sc.nextLine();

    System.out.print("Nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Apellido: ");
    String apellido = sc.nextLine();
    
    System.out.print("Edad: ");
    int edad = sc.nextInt();
    sc.nextLine();
    
    System.out.print("Semestre: ");
    int semestre = sc.nextInt();
    sc.nextLine();
    
    estudiante nuevo = new estudiante(id, nombre, apellido,edad,semestre);
    estudiantes.add(nuevo);

    System.out.println("Estudiante registrado correctamente.");
}
       
        public static void listarEstudiantes() {
    System.out.println("\n--- LISTA DE ESTUDIANTES ---");

    if (estudiantes.isEmpty()) {
        System.out.println("No hay estudiantes registrados.");
        return;
    }

    for (estudiante e : estudiantes) {
        System.out.println(e);
    }
}
        public static void buscarEstudiante() {
    System.out.print("\nIngrese el ID del estudiante a buscar: ");
    String id = sc.nextLine();

    for (estudiante e : estudiantes) {
        if (e.getCodigo().equals(id)) {
            System.out.println("Estudiante encontrado:");
            System.out.println(e);
            return;
        }
    }

    System.out.println("Estudiante no encontrado.");
}
        public static void actualizarEstudiante() {
    System.out.print("\nIngrese el código del estudiante a actualizar: ");
    String codigo = sc.next();

    estudiante estudianteEncontrado = null;

    for (estudiante e : estudiantes) {
        if (e.getCodigo().equals(codigo)) {
            estudianteEncontrado = e;
            break;
        }
    }

    if (estudianteEncontrado == null) {
        System.out.println("Estudiante no encontrado.");
        return;
    }

    sc.nextLine(); 

    System.out.print("Nuevo nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Nuevo apellido: ");
    String apellido = sc.nextLine();

    System.out.print("Nueva edad: ");
    int edad = sc.nextInt();
    sc.nextLine();

    System.out.print("Nuevo semestre: ");
    int semestre = sc.nextInt();
    sc.nextLine();

    estudianteEncontrado.setNombre(nombre);
    estudianteEncontrado.setApellido(apellido);
    estudianteEncontrado.setEdad(edad);
    estudianteEncontrado.setSemestre(semestre);

    System.out.println("Estudiante actualizado correctamente.");
}
        public static void eliminarEstudiante() {
    System.out.print("\nIngrese el código del estudiante a eliminar: ");
    String codigo = sc.next();

    for (int i = 0; i < estudiantes.size(); i++) {
        if (estudiantes.get(i).getCodigo().equals(codigo)) {
            estudiantes.remove(i);
            System.out.println("Estudiante eliminado correctamente.");
            return;
        }
    }

    System.out.println("Estudiante no encontrado.");
}
    public static void registrarAsignatura() {
    System.out.println("\n--- REGISTRAR Asignatura ---");

    System.out.print("Codigo: ");
    String codigo = sc.nextLine();

    System.out.print("Nombre: ");
    String nombre = sc.nextLine();
    
    System.out.print("Creditos: ");
    int creditos = sc.nextInt();
    sc.nextLine();
    
    System.out.print("Docente: ");
    String docente = sc.nextLine();
    
    Asignatura nueva = new Asignatura(codigo, nombre, creditos, docente);
    asignaturas.add(nueva);

    System.out.println("Asignatura registrada correctamente...");
}    
    
        public static void listarAsignaturas() {
    System.out.println("\n--- LISTA DE Asignaturas ---");

    if (asignaturas.isEmpty()) {
        System.out.println("No hay asignaturas registradas.");
        return;
    }

    for (Asignatura a : asignaturas) {
        System.out.println(a);
    }
}
        
        public static void buscarAsignatura() {
    System.out.print("\nIngrese el codigo de la asignatura a buscar: ");
    String codigo = sc.nextLine();

    for (Asignatura a : asignaturas) {
        if (a.getCodigo().equals(codigo)) {
            System.out.println("Asignatura encontrada:");
            System.out.println(a);
            return;
        }
    }

    System.out.println("Asignatura no encontrada...");
} 
        
        public static void actualizarAsignatura() {
    System.out.print("\nIngrese el codigo de la asignatura a actualizar: ");
    String codigo = sc.next();

    Asignatura asignaturaEncontrada = null;

    for (Asignatura a : asignaturas) {
        if (a.getCodigo().equals(codigo)) {
            asignaturaEncontrada = a;
            break;
        }
    } 
     if (asignaturaEncontrada == null) {
        System.out.println("Asignatura no encontrada...");
        return;
    }

    sc.nextLine(); 

    System.out.print("Nuevo nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Nuevos creditos: ");
    int creditos = sc.nextInt();
    sc.nextLine();
    
    System.out.print("Nuevo docente: ");
    String docente = sc.nextLine();

    asignaturaEncontrada.setNombre(nombre);
    asignaturaEncontrada.setCreditos(creditos);
    asignaturaEncontrada.setDocente(docente);

    System.out.println("Asignatura actualizada correctamente...");
}
        
        public static void eliminarAsignatura() {
    System.out.print("\nIngrese el codigo de la asignatura a eliminar: ");
    String codigo = sc.next();

    for (int i = 0; i < asignaturas.size(); i++) {
        if (asignaturas.get(i).getCodigo().equals(codigo)) {
            asignaturas.remove(i);
            System.out.println("Asignatura eliminada correctamente.");
            return;
        }
    }

    System.out.println("Asignatura no encontrada.");
}
}
