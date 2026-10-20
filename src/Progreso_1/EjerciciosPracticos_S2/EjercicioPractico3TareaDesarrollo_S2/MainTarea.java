package Progreso_1.EjerciciosPracticos_S2.EjercicioPractico3TareaDesarrollo_S2;

public class MainTarea {
    public static void main(String[] args) {

        // Instanciamos tres tareas de desarrollo
        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        // Valores a los atributos de cada tarea

        // Tarea 1 (Asignada a ti, Christian)
        tarea1.titulo = "Implementación de Autenticación JWT";
        tarea1.responsable = "Christian Fiallos";
        tarea1.horasEstimadas = 10.0;
        tarea1.completada = false;

        // Tarea 2
        tarea2.titulo = "Diseño de Arquitectura de Microservicios";
        tarea2.responsable = "Javier Córdova";
        tarea2.horasEstimadas = 15.5;
        tarea2.completada = false;

        // Tarea 3
        tarea3.titulo = "Optimización de Consultas SQL";
        tarea3.responsable = "Lily Córdoba";
        tarea3.horasEstimadas = 6.5;
        tarea3.completada = false;

        // Comprobación de métodos y estados iniciales
        System.out.println("=== ESTADO INICIAL DE LAS TAREAS ===");
        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();

        System.out.println("\n=== COMPLETANDO TAREA 1 (CHRISTIAN) ===");
        tarea1.completar(); // Cambiamos el estado a true
        tarea1.mostrarInformacion();

        System.out.println("\n=== ESTADO FINAL (VERIFICANDO AISLAMIENTO) ===");
        // Comprobamos que solo la tarea 1 se completó y las demás siguen intactas
        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();

        System.out.println("\n=== CONSULTA DE RESPONSABLE (TAREA 2) ===");
        tarea2.mostrarResponsable();
    }
}