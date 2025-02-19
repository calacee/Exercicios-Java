package school.sptech;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numeroAleatorio, numeroEscolhido, contador;
        contador = 0;
        System.out.println("Escolha um número entre 0 e 10:");
        numeroEscolhido = scanner.nextInt();
        numeroAleatorio = ThreadLocalRandom.current().nextInt(0,11);
        while(numeroAleatorio != numeroEscolhido){
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0,11);
            contador += 1;
        }
        if(contador <= 3)
            System.out.println("Você é muito sortudo");
        else if(contador <= 10)
            System.out.println("Você é sortudo");
        else
            System.out.println("É melhor você parar de apostar e ir trabalhar");
    }
}