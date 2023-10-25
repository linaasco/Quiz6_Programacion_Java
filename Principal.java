import java.util.Scanner;

/**
 * Clase principal
 */
public class Principal {
    /**
     * Primer método que se ejecuta al correr el programa.
     *
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la firgura");

        String nombre= sc.nextLine();
        System.out.println("Ingrese el color de la figura");

        String color = sc.nextLine();
        System.out.println("Ingrese el tipo de la figura 1:Circulo,2:Rectángulo,3:Triángulo");
        int tipoFigura = sc.nextInt();

        FiguraGeometrica figura;

        switch (tipoFigura){
            case 1:
                System.out.println("Ingrese el radio del circulo");
                double radio= sc.nextDouble();
                figura= new Circulo(nombre,color,radio);
                break;

            case 2:
                System.out.println("Ingrese el primer lado del rectangulo");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el segundo lado del rectangulo");
                double lado2 = sc.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
                break;

            case 3:
                System.out.println("Ingrese la base del triangulo");
                double base = sc.nextDouble();
                System.out.println("Ingrese la altura del triangulo");
                double altura = sc.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;

            default:
                System.out.println("Tipo de figura no válido");
                return;
        }
        double area = figura.obtenerArea();
        double perimetro = figura.obtenerPerimetro();

        System.out.println("Área de la figura: " + area);
        System.out.println("Perímetro de la figura: " + perimetro);
    }

    }

