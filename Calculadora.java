import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita dois números ao usuário
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Exibe os resultados das operações
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));

        scanner.close();
    }
}