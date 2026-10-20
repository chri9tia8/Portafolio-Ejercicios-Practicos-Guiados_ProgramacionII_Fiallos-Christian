package Progreso_1.EjerciciosPracticos_S4.EjercicioPractico1Usuario_S4;

public class MainUsuario {
    public static void main(String[] args) {
        // Creación de usuarios usando el constructor
        Usuario u1 = new Usuario("cfiallos", "cfiallos@udla.edu.ec");
        Usuario u2 = new Usuario("jperez", "jperez@correo.com");
        Usuario u3 = new Usuario("mproano", "mproano@correo.com");
        Usuario u4 = new Usuario("lcordova", "lcordova@correo.com");

        System.out.println("=== LISTA DE USUARIOS REGISTRADOS ===");
        u1.mostrarDetalle();
        u2.mostrarDetalle();
        u3.mostrarDetalle();
        u4.mostrarDetalle();

        // Consulta del total usando el método estático
        System.out.println("\nTotal de usuarios registrados: " + Usuario.getContadorUsuarios());
    }
}