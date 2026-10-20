package Progreso_1.TallerP1_ProgramacionII_Fiallos_Yunga.ejercicio1_factura;

import java.util.Scanner;

/**
 * Ejercicio 3.12 - Aplicacion de prueba PruebaFactura
 * @author CHRISTIAN FIALLOS GUERRERO, CESAR YUNGA NIEVES
 */
public class MainFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== REGISTRO DE FACTURA FERRETERIA ===");
        System.out.println("Ingrese el numero de pieza:");
        String numero = sc.nextLine();

        System.out.println("Ingrese la descripcion de la pieza:");
        String descripcion = sc.nextLine();

        System.out.println("Ingrese la cantidad de articulos:");
        int cantidad = sc.nextInt();

        System.out.println("Ingrese el precio por articulo:");
        double precio = sc.nextDouble();

        // Creacion del objeto Factura
        Factura factura1 = new Factura(numero, descripcion, cantidad, precio);

        // Mostrar resultados
        System.out.println("\n--- DETALLE DE LA FACTURA ---");
        System.out.println("Numero de pieza: " + factura1.obtenerNumeroPieza());
        System.out.println("Descripcion: " + factura1.obtenerDescripcionPieza());
        System.out.println("Cantidad: " + factura1.obtenerCantidad());
        System.out.println("Precio por articulo: $" + factura1.obtenerPrecioPorArticulo());
        System.out.println("Monto total de la factura: $" + factura1.obtenerMontoFactura());

        sc.close();
    }
}