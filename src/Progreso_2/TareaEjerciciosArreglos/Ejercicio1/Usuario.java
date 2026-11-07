package Progreso_2.TareaEjerciciosArreglos.Ejercicio1;

public class Usuario {
    private String nombreUsuario;
    private String correo;
    private String contrasena;

    // Constructor por defecto
    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(String nombreUsuario, String correo, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        setContrasena(contrasena); // Usamos el set para validar
    }

    // Métodos Get y Set
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        // Validar que la contraseña tenga al menos 8 caracteres
        if (contrasena.length() >= 8) {
            this.contrasena = contrasena;
        } else {
            System.out.println("Advertencia: La contraseña '" + contrasena + "' es muy corta. Debe tener al menos 8 caracteres.");
            this.contrasena = "PorDefecto123"; // Contraseña temporal segura por defecto
        }
    }

    // Metodo utilitario para mostrar datos (sin mostrar la contraseña)
    public void mostrarDatos() {
        System.out.println("--- DATOS DEL USUARIO ---");
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Correo electrónico: " + correo);
        System.out.println("-------------------------");
    }
}