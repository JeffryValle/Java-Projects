
package vehiculo;

/**
 *
 * @author jeffr
 */
public class Vehiculo {
    // Atributos
    public String marca;
    public String modelo;
    public String color;
    public String placa;
    public int anio;
    private String estado;
    
    // Constructores
    public Vehiculo(String marca, String modelo, String color, String placa, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.anio = anio;
    }
    public Vehiculo() {
        this.marca = "Nissan";
        this.modelo = "Sentra";
        this.color = "Blanco";
        this.placa = "PHN9898";
        this.anio = 2010;
        this.estado = "Detenido";
    }
    //Metodos
    
    public void Acelerar(String estado){
       this.estado = estado;
    }
    public void Frenar(String estado) {
        this.estado = estado;
    }
    public String getEstado() {
        return this.estado;
    }
    
}
