package Progreso_1.TallerP1_ProgramacionII_Fiallos_Yunga.ejercicio4_frecuencias;

import javax.swing.JOptionPane;

/**
 * Ejercicio 3.16 - Aplicacion de prueba PruebaFrecuenciasCardiacas
 * @author CHRISTIAN FIALLOS GUERRERO, CESAR YUNGA NIEVES
 */
public class MainFrecuenciasCardiacas {
    public static void main(String[] args) {
        // Solicitud de datos con JOptionPane
        String nombre = JOptionPane.showInputDialog("Ingrese su primer nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su mes de nacimiento (1-12):"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dia de nacimiento (1-31):"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento:"));

        // Creacion del objeto
        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, mes, dia, anio);

        // Construccion del mensaje de salida
        String reporte = "=== REPORTE DE FRECUENCIA CARDIACA ===\n"
                + "Nombre: " + persona.obtenerPrimerNombre() + " " + persona.obtenerApellido() + "\n"
                + "Fecha de nacimiento: " + persona.obtenerMesNacimiento() + "/"
                + persona.obtenerDiaNacimiento() + "/" + persona.obtenerAnioNacimiento() + "\n"
                + "Edad: " + persona.obtenerEdad() + " años\n"
                + "Frecuencia cardiaca maxima: " + persona.obtenerFrecuenciaCardiacaMaxima() + " ppm\n"
                + "Frecuencia cardiaca esperada (50% - 85%): " + persona.obtenerFrecuenciaCardiacaEsperada();

        // Impresion en ventana emergente y consola
        JOptionPane.showMessageDialog(null, reporte);
        System.out.println(reporte);
    }
}