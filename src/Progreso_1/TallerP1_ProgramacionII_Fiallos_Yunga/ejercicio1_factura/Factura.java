package Progreso_1.TallerP1_ProgramacionII_Fiallos_Yunga.ejercicio1_factura;

/**
 * Ejercicio 3.12 - Clase Factura
 * @author CHRISTIAN FIALLOS GUERRERO, CESAR YUNGA NIEVES
 */
public class Factura {
    // Variables de instancia privadas
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    // Constructor con parametros
    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        establecerCantidad(cantidad);
        establecerPrecioPorArticulo(precioPorArticulo);
    }

    // Metodos establecer (setters) y obtener (getters)
    public void establecerNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String obtenerNumeroPieza() {
        return numeroPieza;
    }

    public void establecerDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    public void establecerCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        }
        if (cantidad <= 0) {
            this.cantidad = 0;
        }
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public void establecerPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo > 0.0) {
            this.precioPorArticulo = precioPorArticulo;
        }
        if (precioPorArticulo <= 0.0) {
            this.precioPorArticulo = 0.0;
        }
    }

    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    // Metodo funcional para calcular el monto de la factura
    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }
}