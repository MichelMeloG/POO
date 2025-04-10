import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n### MENU ###");
            System.out.println("1 - Calculadora");
            System.out.println("2 - Calculadora Float");
            System.out.println("3 - Cálculo Salário");
            System.out.println("4 - Calculadora de Raio");
            System.out.println("0 - Sair");

            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calculadora();
                    break;
                case 2:
                    calculadoraFloat();
                    break;
                case 3:
                    salario();
                    break;
                case 4:
                    calculadoraRaio();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void calculadora() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = teclado.nextInt();

        System.out.print("Digite outro número: ");
        int b = teclado.nextInt();

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;

        // Tratamento para divisão por zero
        if (b != 0) {
            int divisao = a / b;
            System.out.println("Divisão é: " + divisao);
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }

        System.out.println("Soma é: " + soma);
        System.out.println("Subtração é: " + subtracao);
        System.out.println("Multiplicação é: " + multiplicacao);
    }

    public static void calculadoraFloat() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float a = teclado.nextFloat();

        System.out.print("Digite outro número: ");
        float b = teclado.nextFloat();

        float soma = a + b;
        float subtracao = a - b;
        float multiplicacao = a * b;

        // Tratamento para divisão por zero
        if (b != 0) {
            float divisao = a / b;
            System.out.println("Divisão é: " + divisao);
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }

        System.out.println("Soma é: " + soma);
        System.out.println("Subtração é: " + subtracao);
        System.out.println("Multiplicação é: " + multiplicacao);
    }

    public static void salario() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        float salarioBase = teclado.nextFloat();

        System.out.print("Qual a porcentagem de aumento? : ");
        float aumento = teclado.nextFloat();

        float salarioComAumento = salarioBase + (salarioBase * aumento / 100);

        System.out.printf("Seu novo salário é: R$ %.2f\n", salarioComAumento);
    }

    public static void calculadoraRaio() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        float raio = teclado.nextFloat();

        final float PI = 3.14159265359f;

        float perimetro = 2 * PI * raio;
        float area = PI * raio * raio;

        System.out.println("O perímetro do círculo é: " + perimetro);
        System.out.println("A área do círculo é: " + area);
    }
}