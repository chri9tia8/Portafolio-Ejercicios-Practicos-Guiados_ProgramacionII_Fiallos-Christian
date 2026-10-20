package Progreso_1.TallerP1_ProgramacionII_Fiallos_Yunga.ejercicio2_empleado;

import java.util.Scanner;

/**
 * Ejercicio 3.13 - Aplicacion de prueba PruebaEmpleado
 * @author CHRISTIAN FIALLOS GUERRERO, CESAR YUNGA NIEVES
 */
public class MainEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Datos del primer empleado
        System.out.println("=== DATOS DEL EMPLEADO 1 ===");
        System.out.println("Ingrese el primer nombre:");
        String nombre1 = sc.next();
        System.out.println("Ingrese el apellido paterno:");
        String apellido1 = sc.next();
        System.out.println("Ingrese el salario mensual:");
        double salario1 = sc.nextDouble();

        Empleado emp1 = new Empleado(nombre1, apellido1, salario1);

        // Datos del segundo empleado
        System.out.println("\n=== DATOS DEL EMPLEADO 2 ===");
        System.out.println("Ingrese el primer nombre:");
        String nombre2 = sc.next();
        System.out.println("Ingrese el apellido paterno:");
        String apellido2 = sc.next();
        System.out.println("Ingrese el salario mensual:");
        double salario2 = sc.nextDouble();

        Empleado emp2 = new Empleado(nombre2, apellido2, salario2);

        // Mostrar salario anual inicial
        System.out.println("\n--- SALARIO ANUAL INICIAL ---");
        System.out.println(emp1.obtenerPrimerNombre() + " " + emp1.obtenerApellidoPaterno()
                + " - Salario Anual: $" + emp1.obtenerSalarioAnual());
        System.out.println(emp2.obtenerPrimerNombre() + " " + emp2.obtenerApellidoPaterno()
                + " - Salario Anual: $" + emp2.obtenerSalarioAnual());

        // Aplicar aumento del 10% a cada empleado
        emp1.aplicarAumentoDiezPorCiento();
        emp2.aplicarAumentoDiezPorCiento();

        // Mostrar salario anual despues del aumento
        System.out.println("\n--- SALARIO ANUAL CON AUMENTO DEL 10% ---");
        System.out.println(emp1.obtenerPrimerNombre() + " " + emp1.obtenerApellidoPaterno()
                + " - Nuevo Salario Anual: $" + emp1.obtenerSalarioAnual());
        System.out.println(emp2.obtenerPrimerNombre() + " " + emp2.obtenerApellidoPaterno()
                + " - Nuevo Salario Anual: $" + emp2.obtenerSalarioAnual());

        sc.close();
    }
}