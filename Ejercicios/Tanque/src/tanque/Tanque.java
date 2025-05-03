
package tanque;

/**
 *
 * @author jeffr
 */
public class Tanque {
    // Atributos
    public float maximo;
    public String fabricante;
    public String material;
    private float cantAgua;

    // Constructores
    public Tanque() {
        this.maximo = 1000.00f;
        this.fabricante = "Bijao";
        this.material = "Cemento";
        this.cantAgua = 0.00f;
    }
    public Tanque(float maximo, String fabricante, String material, float cantAgua) {
        this.maximo = maximo;
        this.fabricante = fabricante;
        this.material = material;
        this.cantAgua = cantAgua;
    }
    //Métodos
    public void DepositarAgua(float agua) {
        if(agua > 0 && agua < this.maximo){
            this.cantAgua += agua;
            this.maximo -= this.cantAgua;
            }
        else
            throw new IllegalArgumentException("Cantidad: La cantidad a depositar debe ser un valor positivo y no debe ser mayor a la capacidad maxima");
    }
    public void RetirarAgua(float agua) {
        if(agua > 0 && agua <= this.cantAgua)
            this.cantAgua -= agua;
        else
            throw new IllegalArgumentException("Cantidad: La cantidad a retirar debe ser un valor positivo y no debe ser mayor a la cantidad existente de agua");
    }

    public float CantidadAgua() {
        return this.cantAgua;
    }
    public float CAPorcentaje() {
        return (this.cantAgua/100)*10;
    }
    
}
