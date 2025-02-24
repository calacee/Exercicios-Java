package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
//        Crie uma classe chamada Sorteio que:
//
//        Escolha um número de 1 a 100.
//        Realize 200 sorteios de números entre 1 e 100.
//        Ao final, exibir:
//
//        Quando o número foi sorteado pela 1ª vez (apresente a posição do sorteio)
//        Quantos números pares foram sorteados.
//        Quantos números ímpares foram sorteados
        Integer numeroEscolhido = 1;
        int contadorPar = 0;
        int contadorImpar = 0;
        boolean numeroEscolhidoEncontrado = false;
        int posicaoNumero = 0;
        for(int i = 0; i < 100; i++){
            Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1,101);
            if(!numeroEscolhidoEncontrado &&
                    numeroEscolhido == numeroAleatorio){
                posicaoNumero = i +1;
            }
            if (numeroAleatorio%2 == 0)
                contadorPar++;
            else
                contadorImpar++;
        }
        if(posicaoNumero != 0)
            System.out.printf("O número apareceu pela primeira vez na %d posição \n Tivemos %d numeros pares \n Tivemos %d numeros impares", posicaoNumero, contadorPar, contadorImpar);
        else
            System.out.printf("O número não apareceu nos sorteios \n Tivemos %d numeros pares \n Tivemos %d numeros impares", contadorPar, contadorImpar);
    }
}
