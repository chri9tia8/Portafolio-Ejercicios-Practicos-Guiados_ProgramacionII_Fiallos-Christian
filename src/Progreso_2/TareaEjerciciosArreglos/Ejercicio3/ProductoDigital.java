package Progreso_2.TareaEjerciciosArreglos.Ejercicio3;

public class ProductoDigital {
    private String nombre;
    private double precio;
    private int stock;

    // Constructor que inicializa los tres atributos
    public ProductoDigital(String nombre, double precio, int stock) {
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }

    // Getters y Setters con validaciones básicas
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
        }
    }

    // Metodo utilitario para mostrar info
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock disponible: " + stock + " unidades");
    }
}