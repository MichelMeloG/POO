import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("insira um número: ");
        float a = teclado.nextFloat();
        int b = (int)a;

        if(a-b > 0.5){
            int valor = b + 1;
            System.out.println(valor);
        }
        else{
            int valor = b;
            System.out.println(valor);
        }
    }

}