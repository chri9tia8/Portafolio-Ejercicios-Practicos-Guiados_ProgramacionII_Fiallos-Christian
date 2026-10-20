package Progreso_1.TallerP1_ProgramacionII_Fiallos_Yunga.ejercicio3_fecha;

/**
 * Ejercicio 3.14 - Clase Fecha
 * @author CHRISTIAN FIALLOS GUERRERO, CESAR YUNGA NIEVES
 */
public class Fecha {
    // Variables de instancia privadas
    private int mes;
    private int dia;
    private int anio;

    // Constructor con parametros
    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    // Metodos establecer y obtener
    public void establecerMes(int mes) {
        this.mes = mes;
    }

    public int obtenerMes() {
        return mes;
    }

    public void establecerDia(int dia) {
        this.dia = dia;
    }

    public int obtenerDia() {
        return dia;
    }

    public void establecerAnio(int anio) {
        this.anio = anio;
    }

    public int obtenerAnio() {
        return anio;
    }

    // Metodo mostrarFecha separado por barras diagonales (/)
    public String mostrarFecha() {
        String fechaFormateada = mes + "/" + dia + "/" + anio;
        System.out.println("Fecha: " + fechaFormateada);
        return fechaFormateada;
    }
}