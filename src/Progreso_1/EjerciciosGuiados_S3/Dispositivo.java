package Progreso_1.EjerciciosGuiados_S3;

public class Dispositivo {

    // Atributos de instancia independientes para cada objeto creado
    private int id;          // Identificador único autoincremental
    private String nombre;   // Nombre descriptivo del hardware
    private String tipo;     // Categoría técnica del dispositivo
    private boolean activo;  // Estado operativo actual (encendido/apagado)

    // Atributo de clase compartido: lleva el conteo global de instancias creadas
    private static int contadorTotal = 0;

    /**
     * Constructor principal: Inicializa el dispositivo y actualiza el contador de clase.
     * @param nombre Nombre asignado al dispositivo.
     * @param tipo Tipo o categoría a la que pertenece.
     */
    public Dispositivo(String nombre, String tipo) {
        contadorTotal++;            // Incrementa el registro global de la clase
        this.id = contadorTotal;    // Asigna el número secuencial actual como ID único
        this.nombre = nombre;
        this.tipo = tipo;
        this.activo = false;        // Por defecto el equipo inicia apagado
    }

    /**
     * Método estático para consultar el total de objetos creados sin instanciar la clase.
     * @return Número total de dispositivos instanciados.
     */
    public static int getTotalCreados() {
        return contadorTotal;
    }

    // Métodos Getters y Setters para la gestión segura de atributos privados
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * Despliega en consola de forma estructurada los detalles y estado del dispositivo.
     */
    public void mostrarDetalle() {
        System.out.println("Registro ID [" + this.id + "] -> Equipo: " + this.nombre + " | Categoría: " + this.tipo + " | Estado Activo: " + this.activo);
    }
}