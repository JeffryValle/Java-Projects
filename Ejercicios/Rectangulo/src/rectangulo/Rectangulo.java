
package rectangulo;

/**
 *
 * @author jeffr
 */
public class Rectangulo {
    // Atributos
    public float x1;
    public float x2;
    public float y1;
    public float y2;
    
    //Constructor

    public Rectangulo() {
        this.x1 = 0.00f;
        this.x2 = 0.00f;
        this.y1 = 0.00f;
        this.y2 = 0.00f;
    }
    public Rectangulo(float x1, float x2, float y1, float y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
/** Java Doc
 * @param base
 * @param altura
 * @return Devuelve el area del rectangulo
 */
    public float Area(float base, float altura) {
        float x;
        x = base*altura;
        return x;
    }
/** Java Doc
 * @param base
 * @param altura
 * @return Devuelve el perimetro del rectangulo
 */
    public float Perimetro(float base, float altura) {
        float p;
        p = (2+base)+(2+altura);
        return p;
    }
/** Java Doc
 * @param base
 * @param altura
 * @return Devuelve la diagonal del rectangulo
 */
    public float Diagonal(float base, float altura) {
        double d;
        d = Math.sqrt( Math.pow(base, 2) + Math.pow(altura, 2));
        float d2 = (float) d;
        return d2;
    }
    
    
}
