package Progreso_1.EjerciciosPracticos_S3.EjercicioPractico2Proyecto_S3;

public class MainProyecto {
    public static void main(String[] args) {
        // Instanciación del objeto Proyecto
        Proyecto proyecto1 = new Proyecto();

        // Asignación de datos iniciales
        proyecto1.setNombre("Sistema de Gestión Web");
        proyecto1.setResponsable("Christian Fiallos");
        proyecto1.setProgreso(45);

        // Visualización de datos iniciales
        System.out.println("=== PRUEBA DE PROYECTO DE SOFTWARE ===");
        System.out.println("Proyecto: " + proyecto1.getNombre());
        System.out.println("Responsable: " + proyecto1.getResponsable());
        System.out.println("Progreso inicial: " + proyecto1.getProgreso() + "%");

        // Pruebas de avance de progreso
        proyecto1.avanzar(30);
        proyecto1.avanzar(40);
        System.out.println("¿Proyecto terminado?: " + proyecto1.isTerminado());
    }
}