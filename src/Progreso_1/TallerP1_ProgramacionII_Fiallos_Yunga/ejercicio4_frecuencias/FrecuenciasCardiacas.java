package Progreso_1.TallerP1_ProgramacionII_Fiallos_Yunga.ejercicio4_frecuencias;

/**
 * Ejercicio 3.16 - Clase FrecuenciasCardiacas
 * @author CHRISTIAN FIALLOS GUERRERO, CESAR YUNGA NIEVES
 */
public class FrecuenciasCardiacas {
    // Atributos privados
    private String primerNombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;

    // Constructor con parametros
    public FrecuenciasCardiacas(String primerNombre, String apellido, int mesNacimiento, int diaNacimiento, int anioNacimiento) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    // Metodos establecer y obtener
    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int obtenerMesNacimiento() {
        return mesNacimiento;
    }

    public void establecerDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int obtenerDiaNacimiento() {
        return diaNacimiento;
    }

    public void establecerAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int obtenerAnioNacimiento() {
        return anioNacimiento;
    }

    // Metodo para calcular la edad en años (usando el año actual 2026)
    public int obtenerEdad() {
        return 2026 - anioNacimiento;
    }

    // Metodo para calcular la frecuencia cardiaca maxima (220 - edad)
    public int obtenerFrecuenciaCardiacaMaxima() {
        return 220 - obtenerEdad();
    }

    // Metodo para calcular el rango de frecuencia cardiaca esperada (50% - 85%)
    public String obtenerFrecuenciaCardiacaEsperada() {
        double rangoMinimo = obtenerFrecuenciaCardiacaMaxima() * 0.50;
        double rangoMaximo = obtenerFrecuenciaCardiacaMaxima() * 0.85;
        return rangoMinimo + " - " + rangoMaximo + " pulsos por minuto";
    }
}