package Progreso_2.TareaEjerciciosArreglos.Ejercicio2;

import java.util.Scanner;

public class MainSensorArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 3;
        SensorTemperatura sensores[] = new SensorTemperatura[MAX];

        int indice = 0;
        int opcion;

        do {
            System.out.println("\n--- MENU CONTROL DE SENSORES ---");
            System.out.println("1. Ingresar sensor (De 1 en 1)");
            System.out.println("2. Mostrar todos los sensores");
            System.out.println("3. Consultar/Modificar sensor por indice especifico");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    // Ingreso de 1 en 1 validando el espacio disponible
                    if (indice < MAX) {
                        System.out.print("Ingrese el ID del sensor: ");
                        String id = sc.nextLine();
                        System.out.print("Ingrese el valor actual de temperatura: ");
                        double valor = Double.parseDouble(sc.nextLine());
                        System.out.print("Ingrese la unidad (ej. Celsius, Fahrenheit): ");
                        String unidad = sc.nextLine();

                        sensores[indice++] = new SensorTemperatura(id, valor, unidad);
                        System.out.println("Sensor agregado exitosamente. Espacios ocupados: " + indice + "/" + MAX);
                    } else {
                        System.out.println("¡Aviso! No hay más memoria disponible en el arreglo.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTADO DE SENSORES REGISTRADOS ---");
                    if (indice == 0) {
                        System.out.println("Todavía no se ha registrado ningun sensor.");
                    } else {
                        for (int i = 0; i < indice; i++) {
                            System.out.print("[" + i + "] ");
                            sensores[i].mostrarLectura();
                        }
                    }
                    break;

                case 3:
                    // Operación solicitando un índice específico al usuario
                    if (indice == 0) {
                        System.out.println("No hay sensores para consultar.");
                    } else {
                        System.out.print("Ingrese el indice del sensor que desea modificar (0 al " + (indice - 1) + "): ");
                        int idx = Integer.parseInt(sc.nextLine());

                        if (idx >= 0 && idx < indice) {
                            System.out.println("Sensor seleccionado:");
                            sensores[idx].mostrarLectura();

                            System.out.print("Ingrese el nuevo valor de temperatura: ");
                            double nuevoValor = Double.parseDouble(sc.nextLine());
                            sensores[idx].setValorActual(nuevoValor);
                            System.out.println("¡Lectura actualizada correctamente!");
                        } else {
                            System.out.println("Error: Índice fuera de rango.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}