/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;


public class Producto {
    // Atributos
    public String codigo;
    public String nombre;
    public float cc;
    public float pv;
    private int cant;
    
    //Constructores

    public Producto(String codigo, String nombre, float cc, float pv) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cc = cc;
        this.pv = pv;
    }
    public Producto() {
        this.codigo = "0101";
        this.nombre = "Libra de café";
        this.cc = 0.00f;
        this.pv = 0.00f;
    }

    public void Aumentar(int cant) {
        if(cant > 0)
            this.cant += cant;
        else
            throw new IllegalArgumentException("Cantidad: Cantidad no debe ser menor a 0");
    }
    public void Disminuir(int cant) {
        if(cant > 0 && cant <= this.cant)
            this.cant -= cant;
        else
            throw new IllegalArgumentException("Cantidad: Cantidad no debe ser menor a 0 o mayor a la cantidad en existencia");
    }

    public int VerProducto() {
        return this.cant;
    }
    
    
}
