package Progreso_1.EjerciciosPracticos_S3.EjercicioPractico2Proyecto_S3;

public class Proyecto {
    // Atributos privados
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    // Asigna el nombre del proyecto
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    // Retorna el nombre del proyecto
    public String getNombre() {
        return this.nombre;
    }

    // Asigna el progreso validando que esté entre 0 y 100
    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            if (progreso == 100) {
                this.terminado = true;
            }
        } else {
            System.out.println("[Error]: El progreso debe estar entre 0 y 100.");
        }
    }

    // Retorna el progreso actual
    public int getProgreso() {
        return this.progreso;
    }

    // Asigna el responsable
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    // Retorna el responsable
    public String getResponsable() {
        return this.responsable;
    }

    // Retorna si está terminado
    public boolean isTerminado() {
        return this.terminado;
    }

    // Avanza el progreso sin superar el 100%
    public void avanzar(int porcentaje) {
        if (porcentaje > 0) {
            int nuevoProgreso = this.progreso + porcentaje;
            if (nuevoProgreso > 100) {
                this.progreso = 100;
                this.terminado = true;
                System.out.println("-> El proyecto '" + this.nombre + "' ha llegado al 100% (Completado).");
            } else {
                this.progreso = nuevoProgreso;
                System.out.println("-> Progreso actualizado de '" + this.nombre + "': " + this.progreso + "%");
            }
        }
    }
}