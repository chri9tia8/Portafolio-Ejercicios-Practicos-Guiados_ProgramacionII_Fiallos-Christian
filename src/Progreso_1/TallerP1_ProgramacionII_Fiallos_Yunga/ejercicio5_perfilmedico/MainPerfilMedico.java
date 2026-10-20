package Progreso_1.TallerP1_ProgramacionII_Fiallos_Yunga.ejercicio5_perfilmedico;

import javax.swing.JOptionPane;

/**
 * Ejercicio 3.17 - Aplicacion de prueba PruebaPerfilMedico
 * @author CHRISTIAN FIALLOS GUERRERO, CESAR YUNGA NIEVES
 */
public class MainPerfilMedico {
    public static void main(String[] args) {
        // Ingreso de datos con ventanas emergentes
        String nombre = JOptionPane.showInputDialog("Ingrese el primer nombre del paciente:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del paciente:");
        String sexo = JOptionPane.showInputDialog("Ingrese el sexo (M/F):");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de nacimiento (1-31):"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento (1-12):"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en centimetros (ej. 175):"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en kilogramos (ej. 70.5):"));

        // Creacion de la instancia PerfilMedico
        PerfilMedico paciente = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        // Construccion del reporte con la tabla de BMI
        String resultado = "=== PERFIL MEDICO DEL PACIENTE ===\n"
                + "Nombre completo: " + paciente.obtenerPrimerNombre() + " " + paciente.obtenerApellido() + "\n"
                + "Sexo: " + paciente.obtenerSexo() + "\n"
                + "Fecha de nacimiento: " + paciente.obtenerDiaNacimiento() + "/"
                + paciente.obtenerMesNacimiento() + "/" + paciente.obtenerAnioNacimiento() + "\n"
                + "Altura: " + paciente.obtenerAltura() + " cm\n"
                + "Peso: " + paciente.obtenerPeso() + " kg\n\n"
                + "--- RESULTADOS MEDICOS ---\n"
                + "Edad: " + paciente.obtenerEdad() + " años\n"
                + "BMI (Indice de Masa Corporal): " + paciente.obtenerBMI() + "\n"
                + "Frecuencia cardiaca maxima: " + paciente.obtenerFrecuenciaCardiacaMaxima() + " ppm\n"
                + "Frecuencia cardiaca esperada: " + paciente.obtenerFrecuenciaCardiacaEsperada() + "\n\n"
                + "VALORES DE BMI\n"
                + "Bajo peso: menos de 18.5\n"
                + "Normal:    entre 18.5 y 24.9\n"
                + "Sobrepeso: entre 25 y 29.9\n"
                + "Obeso:     30 o mas";

        // Mostrar en ventana emergente y consola
        JOptionPane.showMessageDialog(null, resultado);
        System.out.println(resultado);
    }
}

