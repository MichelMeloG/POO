import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("escolha a sua operação aritmética + | - | * | / ");
        char op = teclado.nextLine().charAt(0);
        System.out.print("Insira um número: ");
        int a = teclado.nextInt();
        System.out.print("Insira outro número: ");
        int b = teclado.nextInt();

        switch (op){
            case '+': System.out.println(a + b);
            break;
            case '-': System.out.println(a - b);
            break;
            case '*': System.out.println(a * b);
            break;
            case '/': System.out.println(a / b);
            break;

        }

    }
}