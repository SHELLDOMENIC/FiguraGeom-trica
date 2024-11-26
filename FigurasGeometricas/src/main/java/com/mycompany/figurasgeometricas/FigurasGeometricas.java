

package com.mycompany.figurasgeometricas;

import static java.awt.SystemColor.menu;
import java.util.Scanner;

public class FigurasGeometricas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        System.out.println("Bienvenidos");
        System.out.println("Seleccione según su conveniencia:");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Triángulo");
        System.out.println("5. Salir");
        
        menu = scanner.nextInt();
        switch(menu){
            case 1:System.out.println("Caso 1: Círculo");
            double radio;
            double diametroCirculo;
            double calcularAreaCirculo;
            double calcularPerimetroCirculo;
            double PI = 3.14159265359;
                System.out.println("Ingrese el Diametro de el circulo");
                diametroCirculo = scanner.nextDouble();
                 radio = diametroCirculo / 2 * PI;
                 calcularAreaCirculo = PI * ( radio * radio );
                 calcularPerimetroCirculo = 2 * PI * radio;
                System.out.println("El radio es: "+radio);
                System.out.println("El Area del circulo es: "+calcularAreaCirculo);
                System.out.println("El perimetro del Circulo es: " +calcularPerimetroCirculo);
                break;
            case 2:System.out.println("Caso 2: Rectángulo");
            float baseRectangulo;
            float alturaRectangulo;
            float calcularAreaRectangulo;
            float calcularPerimetroRectangulo;
        }
        
    }
}
