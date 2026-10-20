package Progreso_1.EjerciciosGuiados_S3.EjercicioGuiado2_S3;

public class Dispositivo {
    // Atributos privados para proteger los datos
    private String nombre;
    private String tipo;
    private boolean activo;

    // Setter de nombre con validación para evitar cadenas vacías o nulas
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("[Error]: El nombre del dispositivo no puede estar vacío.");
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    // Getters y Setters para el tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    // Getters y Setters para el estado activo
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isActivo() {
        return this.activo;
    }

    // Métodos de acción propios del objeto
    public void activar() {
        this.activo = true;
        System.out.println("-> Dispositivo '" + this.nombre + "' encendido correctamente.");
    }

    public void desactivar() {
        this.activo = false;
        System.out.println("-> Dispositivo '" + this.nombre + "' apagado correctamente.");
    }
}