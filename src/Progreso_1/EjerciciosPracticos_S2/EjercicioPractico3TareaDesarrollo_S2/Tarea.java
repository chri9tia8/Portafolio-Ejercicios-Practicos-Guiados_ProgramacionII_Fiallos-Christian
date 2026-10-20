package Progreso_1.EjerciciosPracticos_S2.EjercicioPractico3TareaDesarrollo_S2;

public class Tarea {

    // Atributos public
    public String titulo;
    public String responsable;

    // Acceso por defecto
    double horasEstimadas;
    boolean completada;

    // Metodos public
    public void mostrarInformacion() {
        System.out.println("--- Detalles de la Tarea ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Responsable: " + this.responsable);
        System.out.println("Horas estimadas: " + this.horasEstimadas + " hrs");
        System.out.println("¿Completada?: " + this.completada);
        System.out.println("----------------------------");
    }

    public void completar() {
        this.completada = true;
        System.out.println(">>> La tarea '" + this.titulo + "' ha sido completada.");
    }

    // Acceso por defecto
    void mostrarResponsable() {
        System.out.println("El responsable de '" + this.titulo + "' es: " + this.responsable);
    }

    void mostrarEstado() {
        System.out.println("Estado de '" + this.titulo + "' (Completada): " + this.completada);
    }
}