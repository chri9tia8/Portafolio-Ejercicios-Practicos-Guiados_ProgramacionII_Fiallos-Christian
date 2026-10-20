package Progreso_1.EjerciciosPracticos_S2.EjercicioPractico2Modulo_S2;

public class MainModulo {
    public static void main(String[] args) {

        // Creamos los diferentes Modulos
        Modulo login = new Modulo();
        Modulo inventario = new Modulo();
        Modulo reportes = new Modulo();

        // Atributos para cada modulo, tienen los mismos atributos porque son modulos

        // Módulo Login
        login.nombre = "Login de Usuarios";
        login.lenguaje = "Java";
        login.version = "1.0";
        login.terminado = false;

        // Módulo Inventario
        inventario.nombre = "Control de Inventario";
        inventario.lenguaje = "Python";
        inventario.version = "2.1";
        inventario.terminado = true;

        // Módulo Reportes
        reportes.nombre = "Generador de Reportes";
        reportes.lenguaje = "C++";
        reportes.version = "1.5";
        reportes.terminado = false;

        // Llamamos a los metodos ya sea para mostrar inf o modificar estado

        System.out.println("=== PRUEBA MÓDULO LOGIN ===");
        login.mostrarInformacion();
        login.marcarTerminado(); // Cambiamos el estado
        login.mostrarEstado(); // Verificamos que se actualizó

        System.out.println("\n=== PRUEBA MÓDULO INVENTARIO ===");
        inventario.mostrarVersion();
        inventario.mostrarEstado();

        System.out.println("\n=== PRUEBA MÓDULO REPORTES ===");
        reportes.mostrarInformacion();
    }
}