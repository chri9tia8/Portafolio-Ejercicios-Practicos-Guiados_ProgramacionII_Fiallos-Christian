package Progreso_1.EjerciciosGuiados_S3.EjercicioGuiado2_S3;

public class MainDispositivo {
    public static void main(String[] args) {
        // Creación de objetos utilizando los métodos set
        Dispositivo dispositivo1 = new Dispositivo();
        dispositivo1.setNombre("Laptop Gamer ASUS");
        dispositivo1.setTipo("Computadora");
        dispositivo1.setActivo(true);

        Dispositivo dispositivo2 = new Dispositivo();
        dispositivo2.setNombre("Servidor Backend Principal");
        dispositivo2.setTipo("Servidor");
        dispositivo2.setActivo(false);

        // Consulta de datos mediante los métodos get
        System.out.println("=== CONSULTA DE ESTADOS CON GETTERS ===");
        System.out.println("Dispositivo 1 -> Nombre: " + dispositivo1.getNombre() + " | Tipo: " + dispositivo1.getTipo() + " | Activo: " + dispositivo1.isActivo());
        System.out.println("Dispositivo 2 -> Nombre: " + dispositivo2.getNombre() + " | Tipo: " + dispositivo2.getTipo() + " | Activo: " + dispositivo2.isActivo());

        // Prueba de la validación (intentando asignar un nombre vacío)
        System.out.println("\n=== PRUEBA DE VALIDACIÓN ===");
        dispositivo1.setNombre("");
        System.out.println("Nombre actual tras el intento fallido: " + dispositivo1.getNombre());

        // Ejecución de métodos de acción
        System.out.println("\n=== PRUEBA DE ACCIONES ===");
        dispositivo2.activar();
        System.out.println("Estado actual del dispositivo 2: " + dispositivo2.isActivo());
    }
}