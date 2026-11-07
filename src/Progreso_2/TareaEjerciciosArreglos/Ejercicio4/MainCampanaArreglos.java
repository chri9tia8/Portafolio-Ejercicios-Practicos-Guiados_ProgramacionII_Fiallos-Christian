package Progreso_2.TareaEjerciciosArreglos.Ejercicio4;

import java.util.Scanner;

public class MainCampanaArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 3;
        CampanaDigital campanias[] = new CampanaDigital[MAX];

        int opcion;

        do {
            System.out.println("\n--- MENU CAMPAÑAS DIGITALES ---");
            System.out.println("1. Registrar todas las campañas (Arreglo completo)");
            System.out.println("2. Mostrar reporte general de campañas");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    // Llenar todo el arreglo utilizando for y length
                    System.out.println("\n--- REGISTRO DE CAMPAÑAS ---");
                    for (int i = 0; i < campanias.length; i++) {
                        System.out.println("Campaña Nro " + (i + 1));
                        System.out.print("Ingrese el nombre de la campaña: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese el número de clics (mayor a 0): ");
                        int clics = Integer.parseInt(sc.nextLine());
                        System.out.print("Ingrese el número de conversiones: ");
                        int conv = Integer.parseInt(sc.nextLine());

                        campanias[i] = new CampanaDigital(nombre, clics, conv);
                    }
                    System.out.println("¡Todas las campañas fueron registradas con éxito!");
                    break;

                case 2:
                    // Recorrer el arreglo completo con for y length para mostrar reportes
                    System.out.println("\n--- REPORTE DE RENDIMIENTO DE CAMPAÑAS ---");
                    boolean registrado = true;
                    for (int i = 0; i < campanias.length; i++) {
                        if (campanias[i] != null) {
                            campanias[i].mostrarReporte();
                            registrado = false;
                        }
                    }
                    if (registrado) {
                        System.out.println("Aún no se han registrado campañas en el sistema.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        sc.close();
    }
}