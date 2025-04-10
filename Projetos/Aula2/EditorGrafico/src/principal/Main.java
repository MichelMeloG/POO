package principal;

import formas.Circulo;
import formas.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        double x = teclado.nextDouble();
        System.out.print("Digite o valor de Y: ");
        double y = teclado.nextDouble();
        System.out.print("Digite o raio: ");
        double raio = teclado.nextDouble();

        Circulo c1 = new Circulo(raio, x, y);

        System.out.println(c1.getArea());
        System.out.println(c1.getDiametro());
        System.out.println(c1.getPerimetro());
    }
}



