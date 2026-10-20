package Progreso_1.TallerP1_ProgramacionII_Fiallos_Yunga.ejercicio3_fecha;

import javax.swing.JOptionPane;

/**
 * Ejercicio 3.14 - Aplicacion de prueba PruebaFecha
 * @author CHRISTIAN FIALLOS GUERRERO, CESAR YUNGA NIEVES
 */
public class MainFecha {
    public static void main(String[] args) {
        // Entrada de datos con ventanas emergentes
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes (1-12):"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia (1-31):"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));

        // Instanciacion del objeto Fecha
        Fecha miFecha = new Fecha(mes, dia, anio);

        // Mostrar fecha en ventana emergente y consola
        JOptionPane.showMessageDialog(null, "La fecha ingresada (mes/dia/año) es: " + miFecha.mostrarFecha());
    }
}