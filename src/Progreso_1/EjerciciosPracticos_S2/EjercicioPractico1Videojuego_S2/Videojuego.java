package Progreso_1.EjerciciosPracticos_S2.EjercicioPractico1Videojuego_S2;

public class Videojuego {

    //Atributos
    public String nombre;
    public String genero;

    //Acceso por defecto
    String version;
    boolean activo;

    // Metodos public
    public void mostrarInformacion() {
        System.out.println("--- Datos del Videojuego ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Versión: " + version);
        System.out.println("¿Está activo?: " + activo);
        System.out.println("----------------------------");
    }

    public void iniciar() {
        activo = true; // Cambiamos el estado a verdadero
        System.out.println(">>> Iniciando el juego: " + nombre);
    }

    // Acceso por defecto
    void cerrar() {
        activo = false; // Cambiamos el estado a falso
        System.out.println(">>> Cerrando el juego: " + nombre);
    }

    void mostrarVersion() {
        System.out.println("La versión actual de " + nombre + " es: " + version);
    }
}