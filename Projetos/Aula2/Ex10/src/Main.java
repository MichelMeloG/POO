import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int a = teclado.nextInt();
        System.out.print("Insira outro número: ");
        int b = teclado.nextInt();
        System.out.print("Insira outro número: ");
        int c = teclado.nextInt();

        if (a < b && a < c){
            System.out.print("Seu primeiro número está antes dos outros dois: ");
        } else if (a > b && a > c) {
            System.out.print("Seu primeiro número está depois dos outros dois: ");
        } else if (a > b && a < c) {
            System.out.print("Seu primeiro número está entre os outros dois: ");
        }
        else if (a < b && a > c) {
            System.out.print("Seu primeiro número está entre os outros dois: ");
        }


    }
}