/**
 * Clase Circulo que hereda de la clase FiguraGeometrica
 */
class Circulo extends FiguraGeometrica {
    private double radio;
    /**
     * Constructor
     * @param nombre
     * @param color
     * @param radio
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Circulo(String nombre, String color, double radio){
        super(nombre, color);
        this.radio=radio;
    }
    /**
     * Metodo para obtener el area de un circulo
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double obtenerArea(){
        double area= Math.PI*(radio*radio);
        return area;
    }
    /**
     * Metodo para obtener el perimetro de un circulo
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double obtenerPerimetro(){
        double perimetro = 2*radio*Math.PI;
        return perimetro;

    }
}
