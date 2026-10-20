package Progreso_1.PracticaProyectoSoftware_S3.src;

public class ProyectoSoftware {

    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    public ProyectoSoftware(String nombre, int progreso, String responsable, boolean terminado) {
        setNombre(this.nombre);
        setProgreso(this.progreso);
        setResponsable(this.responsable);
        setTerminado(this.terminado);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        this.progreso = progreso;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
}
