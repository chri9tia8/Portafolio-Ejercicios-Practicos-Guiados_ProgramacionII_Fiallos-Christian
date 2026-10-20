package Progreso_1.EjerciciosPracticos_S4.EjercicioPractico2Aplicacion_S4;

public class MainAplicacion {
    public static void main(String[] args) {
        // Creación de instancias usando el constructor
        Aplicacion app1 = new Aplicacion("SistemaVentas", "1.0");
        Aplicacion app2 = new Aplicacion("ControlInventario", "2.1");

        System.out.println("=== ESTADO INICIAL DE APLICACIONES ===");
        app1.mostrarInformacion();
        app2.mostrarInformacion();

        System.out.println("\n=== ACCIONES ===");
        app1.iniciar();

        System.out.println("\nTotal de aplicaciones creadas: " + Aplicacion.getTotalAplicaciones());
        System.out.println("¿App 1 ejecutándose?: " + app1.isEjecutando());
    }
}