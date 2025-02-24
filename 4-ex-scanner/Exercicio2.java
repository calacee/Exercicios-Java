package school.sptech;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numeroEscolhido;
        do {
            System.out.println("Escolha um número entre 0 e 100");
            numeroEscolhido = scanner.nextInt();
        } while (numeroEscolhido <= 0 || numeroEscolhido >= 100);
        boolean numeroEscolhidoEncontrado = false;
        int posicaoNumero = 51;
        for(int i = 0; i < 200; i++){
            Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1,101);
            if(!numeroEscolhidoEncontrado &&
                    numeroEscolhido == numeroAleatorio){
                posicaoNumero = i +1;
                break;
            }
        }
        if(posicaoNumero < 10)
            System.out.println("Você é MUITO sortudo");
        else if (posicaoNumero < 50)
            System.out.println("Você é sortudo");
        else
            System.out.println("Melhor parar de apostar e ir trabalhar!");
    }
}
