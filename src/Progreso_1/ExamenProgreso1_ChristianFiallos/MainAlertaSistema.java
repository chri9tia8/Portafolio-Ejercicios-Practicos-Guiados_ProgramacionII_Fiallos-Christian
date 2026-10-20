package Progreso_1.ExamenProgreso1_ChristianFiallos;

public class MainAlertaSistema {
    public static void main(String[] args){
        System.out.println("-----Pruebas de Funcionamiento del Examen------");

        AlertaSistema alerta1 = new AlertaSistema(10, "Error de Conexion");

        System.out.println("Prioridad Inicial: " + alerta1.getNivelPrioridad());
        System.out.println("¿Aumento la Prioridad?: " + alerta1.aumentarPrioridad() + " | Prioridad: " + alerta1.getNivelPrioridad());

        alerta1.aumentarPrioridad();
        alerta1.aumentarPrioridad();
        System.out.println("¿Es urgente (4 o 5)?: " + alerta1.esUrgente());

        alerta1.aumentarPrioridad();
        System.out.println("¿Puede subir de 5?: " + alerta1.aumentarPrioridad() + "| Prioridad " + alerta1.getNivelPrioridad());

        alerta1.setDescripcion(" ");
        System.out.println("Descripcion conservada:" + alerta1.getDescripcion());
        System.out.println("total alertas creadas:" + AlertaSistema.getContadorAlertas());

    }

}
