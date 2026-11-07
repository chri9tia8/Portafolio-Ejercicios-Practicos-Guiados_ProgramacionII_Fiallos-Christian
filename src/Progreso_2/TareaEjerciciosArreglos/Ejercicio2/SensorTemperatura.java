package Progreso_2.TareaEjerciciosArreglos.Ejercicio2;

public class SensorTemperatura {
    private String idSensor;
    private double valorActual;
    private String unidad;

    // Constructor para inicializar los atributos
    public SensorTemperatura(String idSensor, double valorActual, String unidad) {
        this.idSensor = idSensor;
        this.valorActual = valorActual;
        this.unidad = unidad;
    }

    // Getters y Setters
    public String getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(String idSensor) {
        this.idSensor = idSensor;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    // Metodo utilitario para mostrar lectura
    public void mostrarLectura() {
        System.out.println("Sensor ID: " + idSensor + " | Lectura: " + valorActual + " " + unidad);
    }
}