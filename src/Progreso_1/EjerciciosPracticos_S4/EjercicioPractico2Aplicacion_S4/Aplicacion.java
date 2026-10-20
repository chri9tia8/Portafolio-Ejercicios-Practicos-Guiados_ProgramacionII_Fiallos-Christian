package Progreso_1.EjerciciosPracticos_S4.EjercicioPractico2Aplicacion_S4;

public class Aplicacion {
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;
    private static int totalAplicaciones = 0;

    // Constructor que recibe nombre y versión, asignando ID y estado inicial
    public Aplicacion(String nombre, String version) {
        totalAplicaciones++;
        this.id = totalAplicaciones;
        this.nombre = nombre;
        this.version = version;
        this.ejecutando = false; // Comienza cerrada por defecto
    }

    // Getters y Setters
    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isEjecutando() {
        return this.ejecutando;
    }

    // Métodos de acción
    public void iniciar() {
        this.ejecutando = true;
        System.out.println("-> La aplicación '" + this.nombre + "' (v" + this.version + ") se ha iniciado.");
    }

    public void cerrar() {
        this.ejecutando = false;
        System.out.println("-> La aplicación '" + this.nombre + "' se ha cerrado.");
    }

    // Método estático para consultar el total de aplicaciones
    public static int getTotalAplicaciones() {
        return totalAplicaciones;
    }

    // Muestra la información de la app
    public void mostrarInformacion() {
        System.out.println("App ID: " + this.id + " | Nombre: " + this.nombre + " | Versión: " + this.version + " | Ejecutando: " + this.ejecutando);
    }
}