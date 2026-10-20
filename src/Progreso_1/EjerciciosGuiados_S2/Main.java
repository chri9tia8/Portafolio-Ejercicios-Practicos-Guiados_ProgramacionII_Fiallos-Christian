package Progreso_1.EjerciciosGuiados_S2;

public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo1 = new Dispositivo();
        dispositivo1.setNombre("Laptop Gamer");
        dispositivo1.setTipo("Computadora");
        dispositivo1.setActivo(true);

        Dispositivo dispositivo2 = new Dispositivo();
        dispositivo2.setNombre("Servidor Backend");
        dispositivo2.setTipo("Servidor");
        dispositivo2.setActivo(false);

        System.out.println("CONSULTA CON GETTERS");
        System.out.println("Dispositivo 1: " + dispositivo1.getNombre() + " | Tipo: " + dispositivo1.getTipo() + " | Activo: " + dispositivo1.isActivo());
        System.out.println("Dispositivo 2: " + dispositivo2.getNombre() + " | Tipo: " + dispositivo2.getTipo() + " | Activo: " + dispositivo2.isActivo());

        System.out.println("\nPRUEBA DE VALIDACIÓN");
        dispositivo1.setNombre("");
        System.out.println("Nombre tras la prueba: " + dispositivo1.getNombre());

        dispositivo2.activar();
        System.out.println("Estado actual dispositivo 2: " + dispositivo2.isActivo());
    }
}