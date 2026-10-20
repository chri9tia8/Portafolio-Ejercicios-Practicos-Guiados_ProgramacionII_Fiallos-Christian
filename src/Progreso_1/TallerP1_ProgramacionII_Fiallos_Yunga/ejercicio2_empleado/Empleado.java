package Progreso_1.TallerP1_ProgramacionII_Fiallos_Yunga.ejercicio2_empleado;

/**
 * Ejercicio 3.13 - Clase Empleado
 * @author CHRISTIAN FIALLOS GUERRERO, CESAR YUNGA NIEVES
 */
public class Empleado {
    // Variables de instancia privadas
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    // Constructor con parametros
    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    // Metodos establecer y obtener
    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public void establecerSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public double obtenerSalarioMensual() {
        return salarioMensual;
    }

    // Metodo para obtener el salario anual
    public double obtenerSalarioAnual() {
        return salarioMensual * 12;
    }

    // Metodo para aplicar aumento del 10%
    public void aplicarAumentoDiezPorCiento() {
        salarioMensual = salarioMensual * 1.10;
    }
}