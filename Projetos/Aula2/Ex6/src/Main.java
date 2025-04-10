import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a distancia percorrida: ");
        float distancia = teclado.nextFloat();

        System.out.print("Digite o tempo (em horas): ");
        float tempo = teclado.nextFloat();

        System.out.print("Digite a quantidade de gasolida consumida: ");
        float gasolina = teclado.nextFloat();

        float velocidade = distancia/tempo;
        float consumo = gasolina/distancia;

        System.out.println(velocidade);
        System.out.println(consumo);







    }
}