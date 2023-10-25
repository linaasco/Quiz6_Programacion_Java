/**
 * Clase Triangulo que hereda de la clase FiguraGeometrica
 */
class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    /**
     * Constructor
     * @param nombre
     * @param color
     * @param base
     * @param altura
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Triangulo (String nombre, String color, double base, double altura){
        super(nombre, color);
        this.base=base;
        this.altura=altura;
    }
    /**
     * Metodo para obtener el area de un triangulo
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double obtenerArea(){
        double area= (base* altura)/2;
        return area;
    }
    /**
     * Metodo para obtener el perimetro de un triangulo
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double obtenerPerimetro(){
        double perimetro = 2*(base+altura);
        return perimetro;
    }

}
