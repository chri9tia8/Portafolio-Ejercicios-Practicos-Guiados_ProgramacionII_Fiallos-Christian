package Progreso_1.EjerciciosGuiados_S2;

public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre del dispositivo no puede estar vacío.");
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public void activar() {
        this.activo = true;
        System.out.println("-> Dispositivo " + this.nombre + " encendido.");
    }

    public void desactivar() {
        this.activo = false;
        System.out.println("-> Dispositivo " + this.nombre + " apagado.");
    }
}