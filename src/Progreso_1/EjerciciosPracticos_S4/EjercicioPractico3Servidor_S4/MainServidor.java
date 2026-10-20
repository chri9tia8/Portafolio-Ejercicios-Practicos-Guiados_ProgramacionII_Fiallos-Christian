package Progreso_1.EjerciciosPracticos_S4.EjercicioPractico3Servidor_S4;

public class MainServidor {
    public static void main(String[] args) {
        // Creación de servidores
        Servidor s1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor s2 = new Servidor("ServidorBD", "192.168.1.50");
        Servidor s3 = new Servidor("ServidorAuth", "192.168.1.80");

        System.out.println("=== ESTADO INICIAL ===");
        s1.mostrarInformacion();
        s2.mostrarInformacion();

        System.out.println("\nTotal de servidores: " + Servidor.getTotalServidores());
        System.out.println("Servidores activos iniciales: " + Servidor.getServidoresActivos());

        System.out.println("\n=== ACTIVANDO SERVIDORES ===");
        s1.activar();
        s2.activar();

        System.out.println("Servidores activos actuales: " + Servidor.getServidoresActivos());

        System.out.println("\n=== DESACTIVANDO UN SERVIDOR ===");
        s1.desactivar();
        System.out.println("Servidores activos finales: " + Servidor.getServidoresActivos());
    }
}