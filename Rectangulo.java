/**
 * Clase Rectangulo que hereda de la clase FiguraGeometrica
 */
class Rectangulo extends FiguraGeometrica {
     private double lado1;
     private double lado2;

     /**
      * Constructor
      * @param nombre
      * @param color
      * @param lado1
      * @param lado2
      *
      * Complejidad temporal: O(1) Tiempo constante
      */
     public Rectangulo(String nombre, String color, double lado1, double lado2){
         super(nombre, color);
         this.lado1=lado1;
         this.lado2=lado2;
     }
     /**
      * Metodo para obtener el area de un rectangulo
      * @return
      *
      * Complejidad temporal: O(1) Tiempo constante
      */
     public double obtenerArea(){
         double area= lado1*lado2;
         return area;
     }
     /**
      * Metodo para obtener el perimetro de un rectangulo
      * @return
      *
      * Complejidad temporal: O(1) Tiempo constante
      */
     public double obtenerPerimetro(){
         double perimetro= 2*(lado1+lado2);
         return perimetro;

     }
}
