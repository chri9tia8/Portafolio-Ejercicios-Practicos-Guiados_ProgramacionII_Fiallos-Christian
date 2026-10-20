package Progreso_1.EjerciciosPracticos_S4.EjercicioPractico3Servidor_S4;

public class Servidor {
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;
    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    // Constructor que asigna IP y nombre (comienza apagado)
    public Servidor(String nombre, String direccionIP) {
        totalServidores++;
        this.id = totalServidores;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = false;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccionIP() {
        return this.direccionIP;
    }

    public boolean isActivo() {
        return this.activo;
    }

    // Activa el servidor controlando el contador estático activo
    public void activar() {
        if (!this.activo) {
            this.activo = true;
            servidoresActivos++;
            System.out.println("-> Servidor [" + this.nombre + "] activado con éxito.");
        } else {
            System.out.println("[Aviso]: El servidor " + this.nombre + " ya se encuentra activo.");
        }
    }

    // Desactiva el servidor actualizando el contador activo
    public void desactivar() {
        if (this.activo) {
            this.activo = false;
            servidoresActivos--;
            System.out.println("-> Servidor [" + this.nombre + "] desactivado.");
        } else {
            System.out.println("[Aviso]: El servidor " + this.nombre + " ya está apagado.");
        }
    }

    // Métodos estáticos globales
    public static int getTotalServidores() {
        return totalServidores;
    }

    public static int getServidoresActivos() {
        return servidoresActivos;
    }

    // Muestra la información del servidor
    public void mostrarInformacion() {
        System.out.println("Servidor ID: " + this.id + " | Nombre: " + this.nombre + " | IP: " + this.direccionIP + " | Activo: " + this.activo);
    }
}