package Progreso_1.EjerciciosPracticos_S2.EjercicioPractico1Videojuego_S2;

public class MainVideojuego {
    public static void main(String[] args) {

        // Objetos
        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego();
        Videojuego juego3 = new Videojuego();

        // Datos de cada juego con nuevos títulos
        // Juego 1
        juego1.nombre = "Grand Theft Auto V";
        juego1.genero = "Mundo Abierto / Acción";
        juego1.version = "1.68";
        juego1.activo = false;

        // Juego 2
        juego2.nombre = "The Witcher 3: Wild Hunt";
        juego2.genero = "RPG de Acción";
        juego2.version = "4.04";
        juego2.activo = true;

        // Juego 3
        juego3.nombre = "Valorant";
        juego3.genero = "Shooter Táctico";
        juego3.version = "8.0";
        juego3.activo = false;

        // Ejecutamos los métodos para verificar estados e independencia
        System.out.println("=== PRUEBA DEL JUEGO 1 ===");
        juego1.mostrarInformacion();
        juego1.iniciar(); // Cambia el estado 'activo' a true
        juego1.mostrarInformacion();

        System.out.println("\n=== PRUEBA DEL JUEGO 2 ===");
        juego2.mostrarVersion();
        juego2.cerrar(); // Cambia el estado 'activo' a false
        juego2.mostrarInformacion(); // Se muestra con estado false tras el cierre

        System.out.println("\n=== PRUEBA DEL JUEGO 3 ===");
        juego3.mostrarInformacion(); // Muestra sus valores originales sin alteraciones
    }
}