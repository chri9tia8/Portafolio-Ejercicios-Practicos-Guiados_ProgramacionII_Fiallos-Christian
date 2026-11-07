package Progreso_2.TareaEjerciciosArreglos.Ejercicio1;

import java.util.Scanner;

public class MainUsuarioArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 3;
        Usuario listaUsuarios[] = new Usuario[MAX];

        int opcion;

        do {
            System.out.println("\n--- MENU GESTION DE USUARIOS ---");
            System.out.println("1. Llenar todos los usuarios del arreglo");
            System.out.println("2. Mostrar todos los usuarios registrados");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    // Llenar todo el arreglo utilizando for y length
                    System.out.println("\n--- LLENANDO REGISTRO DE USUARIOS ---");
                    for (int i = 0; i < listaUsuarios.length; i++) {
                        System.out.println("Usuario Nro " + (i + 1));
                        System.out.print("Ingrese el nombre de usuario: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese el correo: ");
                        String correo = sc.nextLine();
                        System.out.print("Ingrese la contraseña (minimo 8 caracteres): ");
                        String pass = sc.nextLine();

                        listaUsuarios[i] = new Usuario(nombre, correo, pass);
                    }
                    break;

                case 2:
                    // Recorrer el arreglo completo con for y length para mostrar datos
                    System.out.println("\n--- LISTA GENERAL DE USUARIOS ---");
                    boolean vacio = true;
                    for (int i = 0; i < listaUsuarios.length; i++) {
                        if (listaUsuarios[i] != null) {
                            listaUsuarios[i].mostrarDatos();
                            vacio = false;
                        }
                    }
                    if (vacio) {
                        System.out.println("No hay usuarios registrados todavia.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida, intente de nuevo.");
            }
        } while (opcion != 3);

        sc.close();
    }
}