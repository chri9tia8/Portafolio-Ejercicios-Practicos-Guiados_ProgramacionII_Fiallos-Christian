package Progreso_1.ExamenProgreso1_ChristianFiallos;

public class AlertaSistema {
    private int identificador;
    private String descripcion;
    private int nivelPrioridad;
    private static int contadorAlertas = 0;

    public AlertaSistema (int identificador, String descripcion){

        if (identificador <= 0 || descripcion == null || descripcion.trim().isEmpty()) {
            System.out.println("Error: Datos Invalidos para la Alerta");
            return;
        }

        this.identificador = identificador;
        this.descripcion = descripcion.trim();
        this.nivelPrioridad = 1;
        contadorAlertas++;
    }
    public  int getIdentificador(){
        return this.identificador;
    }

    public String getDescripcion(){
        return  this.descripcion;
    }

    public int getNivelPrioridad(){
        return this.nivelPrioridad;
    }

    public void setDescripcion(String descripcion){
        if (descripcion != null && descripcion.trim().isEmpty()) {
            this.descripcion = descripcion.trim();
        }
    }

    public static int getContadorAlertas(){
        return contadorAlertas;
    }

    public boolean aumentarPrioridad() {
        if (this.nivelPrioridad < 5) {
            this.nivelPrioridad++;
            return true;
        }
        return false;
    }
    public boolean esUrgente() {
        return this.nivelPrioridad == 4 || this.nivelPrioridad == 5;
    }
}

