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
        int soma = 0, qtd = 0;


        if (a>b){
            int aux = a;
            a = b;
            b = aux;
        }

        for (int i = a; i<=b; i++) {
            if(i % 2 ==0 ) {
                System.out.println(i);
                soma += i;
                qtd++;
            }
        }

        float media = (float) soma / qtd;
        System.out.println("A soma é: " + soma);
        System.out.println("A media é: " + media);
    }
}