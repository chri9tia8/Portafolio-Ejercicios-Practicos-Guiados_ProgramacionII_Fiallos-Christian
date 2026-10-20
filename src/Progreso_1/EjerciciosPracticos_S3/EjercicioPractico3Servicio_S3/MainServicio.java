package Progreso_1.EjerciciosPracticos_S3.EjercicioPractico3Servicio_S3;

public class MainServicio {
    public static void main(String[] args) {
        // Instanciación del objeto Servicio
        Servicio servicio1 = new Servicio();

        // Configuración inicial
        servicio1.setNombre("API REST Autenticación");
        servicio1.setPuerto(5000);

        // Pruebas de ejecución
        System.out.println("=== PRUEBA DE SERVICIO DE SOFTWARE ===");
        servicio1.iniciar();

        servicio1.registrarPeticion();
        servicio1.registrarPeticion();
        servicio1.registrarPeticion();

        // Consulta de peticiones y cierre
        System.out.println("Total de peticiones procesadas: " + servicio1.getCantidadPeticiones());
        servicio1.detener();
    }
}