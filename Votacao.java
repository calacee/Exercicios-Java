package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Votacao {
    public static void main(String[] args) {
//        8) Votação
//        Crie uma classe chamada Votacao: Foi feita uma pesquisa para saber
//        qual o sabor de pizza favorito entre os alunos da Faculdade:
//
//        Para votar no sabor mussarela, sorteie o valor 1.
//        Para votar no sabor calabresa, sorteie o valor 2.
//        Para votar no sabor quatro queijos, sorteie o valor 3.
//        Sorteie os votos de 10 alunos diferentes (sem usar vetor) e exiba:
//
//        Quantos votos obteve cada sabor.
//                Qual o sabor favorito segundo a pesquisa.
        Integer votosMussarela = 0;
        Integer votosCalabresa = 0;
        Integer votos4Queijos = 0;
        Integer votoAleatorio;
        for(int i = 0; i < 10; i++){
            votoAleatorio = ThreadLocalRandom.current().nextInt(1,4);
            if(votoAleatorio == 1)
                votosMussarela ++;
            if(votoAleatorio == 2)
                votosCalabresa ++;
            if(votoAleatorio == 3)
                votos4Queijos ++;
        }
        System.out.printf("Votos Mussarela = %d\nVotos Calabresa = %d\nVotos Quatro Queijos = %d\n", votosMussarela, votosCalabresa, votos4Queijos);
        if (votosCalabresa > votosMussarela && votosCalabresa > votos4Queijos )
            System.out.println("Calabresa é favorita");
        else if (votosMussarela > votosCalabresa && votosMussarela > votos4Queijos)
            System.out.println("Mussarela é favorita");
        else
            System.out.println("Quatro Queijos é favorita");
    }
}
