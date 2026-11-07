package Progreso_2.TareaEjerciciosArreglos.Ejercicio4;

public class CampanaDigital {
    private String nombreCampania;
    private int clics;
    private int conversiones;

    // Constructor
    public CampanaDigital(String nombreCampania, int clics, int conversiones) {
        this.nombreCampania = nombreCampania;
        setClics(clics);
        setConversiones(conversiones);
    }

    public String getNombreCampania() {
        return nombreCampania;
    }

    public void setNombreCampania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
    }

    public int getClics() {
        return clics;
    }

    public void setClics(int clics) {
        if (clics > 0) {
            this.clics = clics;
        } else {
            this.clics = 1; // Evita divisiones por cero
        }
    }

    public int getConversiones() {
        return conversiones;
    }

    public void setConversiones(int conversiones) {
        this.conversiones = conversiones;
    }

    // Metodo utilitario para calcular tasa de conversión
    public double tasaConversion() {
        return ((double) conversiones / clics) * 100.0;
    }

    // Metodo para mostrar reporte
    public void mostrarReporte() {
        System.out.println("Campaña: " + nombreCampania);
        System.out.println(" - Clics: " + clics);
        System.out.println(" - Conversiones: " + conversiones);
        System.out.printf(" - Tasa de conversión: %.2f%%\n", tasaConversion());
        System.out.println("----------------------------------------");
    }
}