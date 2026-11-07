package Progreso_2.TareaEjerciciosArreglos.Ejercicio3;

import java.util.Scanner;

public class MainProductoArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 4;
        ProductoDigital inventario[] = new ProductoDigital[MAX];

        int indiceActual = 0;
        int opcion;

        do {
            System.out.println("\n--- MENU TIENDA ONLINE ---");
            System.out.println("1. Ingresar productos por cantidad");
            System.out.println("2. Mostrar inventario completo");
            System.out.println("3. Actualizar stock de un producto por indice");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuantos productos desea ingresar?: ");
                    int cantidad = Integer.parseInt(sc.nextLine());

                    if ((indiceActual + cantidad) <= MAX) {
                        int contador = 0;
                        while (contador < cantidad) {
                            System.out.println("\nProducto " + (indiceActual + 1));
                            System.out.print("Ingrese el nombre del producto: ");
                            String nombre = sc.nextLine();
                            System.out.print("Ingrese el precio: ");
                            double precio = Double.parseDouble(sc.nextLine());
                            System.out.print("Ingrese el stock inicial: ");
                            int stock = Integer.parseInt(sc.nextLine());

                            inventario[indiceActual++] = new ProductoDigital(nombre, precio, stock);
                            contador++;
                        }
                        System.out.println("¡Productos ingresados con éxito!");
                    } else {
                        System.out.println("No hay suficiente espacio en el arreglo para esa cantidad. Espacio libre: " + (MAX - indiceActual));
                    }
                    break;

                case 2:
                    System.out.println("\n--- INVENTARIO DE LA TIENDA ---");
                    if (indiceActual == 0) {
                        System.out.println("El inventario está vacio.");
                    } else {
                        for (int i = 0; i < indiceActual; i++) {
                            System.out.print("Índice [" + i + "] -> ");
                            inventario[i].mostrarInfo();
                        }
                    }
                    break;

                case 3:
                    if (indiceActual == 0) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        System.out.print("Ingrese el índice del producto a actualizar (0 al " + (indiceActual - 1) + "): ");
                        int idx = Integer.parseInt(sc.nextLine());

                        if (idx >= 0 && idx < indiceActual) {
                            System.out.println("Producto actual: " + inventario[idx].getNombre());
                            System.out.print("Ingrese la nueva cantidad de stock: ");
                            int nuevoStock = Integer.parseInt(sc.nextLine());
                            inventario[idx].setStock(nuevoStock);
                            System.out.println("¡Stock actualizado correctamente!");
                        } else {
                            System.out.println("Índice no válido.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 4);

        sc.close();
    }
}