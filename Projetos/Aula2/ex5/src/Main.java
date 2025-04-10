import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Digite os segundos: ");
        long t = teclado.nextLong();

        long hora = t/3600;
        long restominuto = t - (hora * 3600);
        long minuto = restominuto/60;
        long segundo = t - (minuto*60 + hora * 3600);


        System.out.println(hora);
        System.out.println(minuto);
        System.out.println(segundo);
    }
}