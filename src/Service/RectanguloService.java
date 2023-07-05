package Service;

import java.util.Scanner;
import pooguiaextra4.Rectangulo;

public class RectanguloService {

    Scanner sc = new Scanner(System.in);

    public Rectangulo crearReactangulo() {

        Rectangulo rect = new Rectangulo();

        System.out.println("Ingrese el tamaño de la base del rectángulo, por favor");
        rect.setBase(sc.nextInt());

//        System.out.println("Ingrese el tamaño de la altura del rectángulo, por favor");
//        rect.setAltura(sc.nextInt());
//
//        if (rect.getAltura() == rect.getBase()) {
//            
//        }
        do {
            System.out.println("Ingrese altura del rectángulo (diferente a la base), por favor");
            rect.setAltura(sc.nextInt());
        } while (rect.getAltura() == rect.getBase());
     

        return rect;

    } // chequear que no sean el mismo numero

    public static double calcularSuperficie(Rectangulo rect) {

        return rect.getBase() * rect.getAltura();

    }

    public static double calcularPerimetro(Rectangulo rect) {

        return (rect.getBase() + rect.getAltura()) * 2;

    }

    public void dibujarRectangulo(Rectangulo rect) {

        for (int i = 0; i < rect.getBase(); i++) {

            System.out.print(" * ");

        }

        System.out.println("");

        for (int i = 0; i < rect.getAltura() - 2; i++) {

            System.out.print(" *");

            for (int j = 0; j < rect.getBase(); j++) {

                if (j != rect.getBase() - 1) {
                    System.out.print("   ");

                } else {
                    System.out.print(" *");
                }

            }
            System.out.println("");
        }

        for (int i = 0; i < rect.getBase(); i++) {

            System.out.print(" * ");

        }
        System.out.println("");
    }

}

//La clase incluirá un método para crear el rectángulo
//con los datos del Rectángulo dados por el usuario. También incluirá un método para
//calcular la superficie del rectángulo y un método para calcular el perímetro del
//rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
//asteriscos usando la base y la altura.

//Superficie = base * altura / Perímetro = (base + altura) * 2.
