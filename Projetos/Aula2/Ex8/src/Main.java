import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o consumo: ");
        int consumo = teclado.nextInt();

        System.out.print("Digite o valor do Kilowatts: ");
        float custo = teclado.nextFloat();

        float valor = (consumo*custo);

        if (consumo<150){
            System.out.println(valor - (valor*0.1));
        }
        else{
            System.out.println(valor);
        }

    }
}






