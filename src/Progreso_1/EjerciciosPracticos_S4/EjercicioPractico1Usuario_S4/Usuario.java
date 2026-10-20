package Progreso_1.EjerciciosPracticos_S4.EjercicioPractico1Usuario_S4;

public class Usuario {
    // Atributos privados
    private int id;
    private String username;
    private String correo;
    private boolean activo;
    private static int contadorUsuarios = 0;

    // Constructor que inicializa los datos obligatorios y genera el ID automático
    public Usuario(String username, String correo) {
        contadorUsuarios++;
        this.id = contadorUsuarios;
        this.username = username;
        this.correo = correo;
        this.activo = true; // Por defecto nace activo
    }

    // Getters y Setters
    public int getId() {
        return this.id;
    }

    public void setUsername(String username) {
        if (username != null && !username.trim().isEmpty()) {
            this.username = username;
        }
    }

    public String getUsername() {
        return this.username;
    }

    public void setCorreo(String correo) {
        if (correo != null && !correo.trim().isEmpty()) {
            this.correo = correo;
        }
    }

    public String getCorreo() {
        return this.correo;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Método estático para consultar el total de usuarios creados
    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }

    // Método para mostrar los detalles del usuario
    public void mostrarDetalle() {
        System.out.println("ID: " + this.id + " | Usuario: " + this.username + " | Correo: " + this.correo + " | Activo: " + this.activo);
    }
}