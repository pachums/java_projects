import java.util.*;

public class Geometria {
    public static void main(String[] args) {

        //circulo
        Circulo circulo = new Circulo(2);
        System.out.println("Área del círculo de radio " + circulo.getRadio() + ": " + circulo.getArea());

        //rectangulo
        Rectangulo rectangulo = new Rectangulo(100, 20);
        System.out.println("Área del rectángulo de base "+rectangulo.getAncho()+" y altura "+
                rectangulo.getAlto()+": " + rectangulo.getArea());

        //cuadrado
        Cuadrado cuadrado = new Cuadrado(1);
        System.out.println("Área del cuadrado de lado "+cuadrado.getLado()+": " + cuadrado.getArea());

        //compareTo
        System.out.println(">Implementación compareTo:");
        System.out.println("Comparamos el círculo con el rectángulo: " + circulo.compareTo(rectangulo));

        //equals
        System.out.println(">Implementación equals:");
        Circulo circulo1 = new Circulo(3, "yellow", true);
        Circulo circulo2 = new Circulo(3, "yellow", true);
        //Circulo circulo2 = new Circulo(3);
        Rectangulo rectangulo1 = new Rectangulo(100, 20);
        Rectangulo rectangulo2 = new Rectangulo(10, 10);
        Cuadrado cuadrado1 = new Cuadrado(10);

        System.out.println("circulo1 es igual a circulo2... " + circulo1.equals(circulo2));
        System.out.println("rectangulo1 es igual a rectangulo2... " + rectangulo1.equals(rectangulo2));
        System.out.println("rectangulo2 es igual a cuadrado1... " + rectangulo2.equals(cuadrado1));
        System.out.println("circulo1 es igual a cuadrado1... " + circulo1.equals(cuadrado1));

        //ask user
        System.out.println(">El usuario crea dos circulos con sus atributos y se comparan: ");
        Scanner sc = new Scanner(System.in);

        // first circle
        System.out.print("Enter radio:");
        float v_radio = sc.nextFloat();
        System.out.print("Enter color:");
        String v_color = sc.next();
        System.out.print("Enter relleno:");
        boolean v_relleno = sc.nextBoolean();

        Circulo circulo_user = new Circulo(v_radio, v_color, v_relleno);
        System.out.println(circulo_user.toString());

        // second circle
        System.out.print("Enter radio:");
        float v2_radio = sc.nextFloat();
        System.out.print("Enter color:");
        String v2_color = sc.next();
        System.out.print("Enter relleno:");
        boolean v2_relleno = sc.nextBoolean();

        Circulo circulo_user2 = new Circulo(v2_radio, v2_color, v2_relleno);
        System.out.println(circulo_user2.toString());

        System.out.println("Comparamos los dos circulos... " + circulo_user.equals(circulo_user2));

    }
}