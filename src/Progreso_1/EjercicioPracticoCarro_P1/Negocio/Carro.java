package Progreso_1.EjercicioPracticoCarro_P1.Negocio;

public class Carro {
    private int potencia;
    private double velocidad;

    /*
    métodos para ingresar información
    set()
    "siempre" el tipo de retorno es void
    siempre recibe un parámetro
    parámetro generalmente es del mismo tipo de atributo
     */
    public void setPotencia(int potencia){
        //se actualiza sólo si el dato es correcto
        if(potencia>0)
            this.potencia = potencia;
    }

    public void setVelocidad(double velocidad){
        //se actualiza si el dato es correcto sino se setea
        if(velocidad < 0 )
            velocidad = 0;
        this.velocidad = velocidad;
    }

    /*
    metodo para sacar información
    get()
    siempre retorna valor
    el tipo de retorno generalmente es del mismo tipo del atributo
     */

    public int getPotencia(){

        return potencia;
    }

    public double getVelocidad(){

        return velocidad;
    }

    public void acelerar(){

        velocidad += potencia;
    }

    void frenar(){

        velocidad /= 2;
    }
}