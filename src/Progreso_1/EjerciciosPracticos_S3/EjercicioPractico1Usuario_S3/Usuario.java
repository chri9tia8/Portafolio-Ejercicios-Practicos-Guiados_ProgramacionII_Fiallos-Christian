package Progreso_1.EjerciciosPracticos_S3.EjercicioPractico1Usuario_S3;

public class Usuario {
    // Atributos privados
    private String username;
    private String correo;
    private int nivel;
    private boolean activo;

    // Asigna el username validando que no esté vacío
    public void setUsername(String username) {
        if (username != null && !username.trim().isEmpty()) {
            this.username = username;
        } else {
            System.out.println("[Error]: El username no puede estar vacío.");
        }
    }

    // Retorna el username
    public String getUsername() {
        return this.username;
    }

    // Asigna el correo validando que no esté vacío
    public void setCorreo(String correo) {
        if (correo != null && !correo.trim().isEmpty()) {
            this.correo = correo;
        } else {
            System.out.println("[Error]: El correo no puede estar vacío.");
        }
    }

    // Retorna el correo
    public String getCorreo() {
        return this.correo;
    }

    // Asigna el nivel validando que no sea negativo
    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        } else {
            System.out.println("[Error]: El nivel no puede ser negativo.");
        }
    }

    // Retorna el nivel
    public int getNivel() {
        return this.nivel;
    }

    // Asigna el estado activo
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Retorna el estado activo
    public boolean isActivo() {
        return this.activo;
    }

    // Activa al usuario
    public void activar() {
        this.activo = true;
        System.out.println("-> El usuario '" + this.username + "' ha sido activado.");
    }

    // Desactiva al usuario
    public void desactivar() {
        this.activo = false;
        System.out.println("-> El usuario '" + this.username + "' ha sido desactivado.");
    }
}