package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {

        Integer qtdNumeros, somaNumeros, gerarNumero;
        qtdNumeros = ThreadLocalRandom.current().nextInt(0,100);
        somaNumeros = 0;
        for (int i = 0; i < qtdNumeros; i++){
            gerarNumero = ThreadLocalRandom.current().nextInt(0,11);
            somaNumeros += gerarNumero;
        }
        System.out.printf("A soma dos números é %d", somaNumeros);
    }
}
