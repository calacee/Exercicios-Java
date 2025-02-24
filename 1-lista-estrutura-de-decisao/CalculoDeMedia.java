package school.sptech;
import java.util.Scanner;

public class CalculoDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        Double nota1, nota2, media;
        System.out.println("Qual seu nome?");
        nome = scanner.next();
        System.out.println("Sua primeira nota:");
        nota1 = scanner.nextDouble();
        System.out.println("Sua segunda nota:");
        nota2 = scanner.nextDouble();
        media = (nota1 + nota2) / 2.0;
        System.out.printf("Olá, %S. Sua média foi de %.2f", nome, media);
    }
}
