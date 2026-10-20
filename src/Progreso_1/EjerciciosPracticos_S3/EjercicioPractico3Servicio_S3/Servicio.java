package Progreso_1.EjerciciosPracticos_S3.EjercicioPractico3Servicio_S3;

public class Servicio {
    // Atributos privados
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    // Asigna el nombre validando que no esté vacío
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("[Error]: El nombre del servicio no puede estar vacío.");
        }
    }

    // Retorna el nombre
    public String getNombre() {
        return this.nombre;
    }

    // Asigna el puerto validando que sea mayor a 0
    public void setPuerto(int puerto) {
        if (puerto > 0) {
            this.puerto = puerto;
        } else {
            System.out.println("[Error]: El puerto debe ser mayor a 0.");
        }
    }

    // Retorna el puerto
    public int getPuerto() {
        return this.puerto;
    }

    // Retorna el estado activo
    public boolean isActivo() {
        return this.activo;
    }

    // Retorna la cantidad de peticiones
    public int getCantidadPeticiones() {
        return this.cantidadPeticiones;
    }

    // Inicia el servicio
    public void iniciar() {
        this.activo = true;
        System.out.println("-> Servicio [" + this.nombre + "] iniciado en el puerto " + this.puerto + ".");
    }

    // Detiene el servicio
    public void detener() {
        this.activo = false;
        System.out.println("-> Servicio [" + this.nombre + "] detenido.");
    }

    // Registra una petición si está activo
    public void registrarPeticion() {
        if (this.activo) {
            this.cantidadPeticiones++;
            System.out.println("-> Petición registrada en " + this.nombre + ". Total: " + this.cantidadPeticiones);
        } else {
            System.out.println("[Aviso]: No se pueden registrar peticiones, el servicio está inactivo.");
        }
    }
}