package Progreso_1.EjerciciosGuiados_S3.EjercicioGuiado3_S3;

public class Main {
    public static void main(String[] args) {

        // Consulta inicial del contador estático antes de instanciar objetos
        System.out.println("=== ESTADO INICIAL DEL SISTEMA ===");
        System.out.println("Dispositivos registrados al arranque: " + Dispositivo.getTotalCreados());

        // Instanciación del primer objeto usando el constructor parametrizado
        System.out.println("\n-> Creando primer dispositivo...");
        Dispositivo d1 = new Dispositivo("Router", "Red");
        System.out.println("Conteo actual tras crear el primer equipo: " + Dispositivo.getTotalCreados());

        // Creación secuencial de objetos adicionales
        System.out.println("\n-> Creando dispositivos adicionales (Teclado y Monitor)...");
        Dispositivo d2 = new Dispositivo("Teclado Mecánico", "Periférico");
        Dispositivo d3 = new Dispositivo("Monitor 144Hz", "Pantalla");

        // Verificación del contador estático actualizado tras múltiples instancias
        System.out.println("Conteo total tras instanciar 3 objetos: " + Dispositivo.getTotalCreados());

        // Impresión detallada de los datos independientes de cada objeto
        System.out.println("\n=== REPORTE DE DETALLES INDEPENDIENTES ===");
        d1.mostrarDetalle();
        d2.mostrarDetalle();
        d3.mostrarDetalle();
    }
}