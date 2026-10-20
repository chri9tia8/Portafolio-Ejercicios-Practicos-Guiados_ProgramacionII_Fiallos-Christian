package Progreso_1.EjerciciosPracticos_S3.EjercicioPractico1Usuario_S3;

public class MainUsuario {
    public static void main(String[] args) {
        // Instanciación del objeto Usuario
        Usuario usuario1 = new Usuario();

        // Asignación de datos mediante setters
        usuario1.setUsername("cfiallos");
        usuario1.setCorreo("cfiallos@udla.edu.ec");
        usuario1.setNivel(3);
        usuario1.setActivo(false);

        // Impresión de resultados con getters
        System.out.println("=== PRUEBA DE USUARIO DEL SISTEMA ===");
        System.out.println("Usuario: " + usuario1.getUsername());
        System.out.println("Correo: " + usuario1.getCorreo());
        System.out.println("Nivel actual: " + usuario1.getNivel());

        // Cambio de estado y comprobación
        usuario1.activar();
        System.out.println("¿Está activo?: " + usuario1.isActivo());
    }
}