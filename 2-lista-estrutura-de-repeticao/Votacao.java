package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Votacao {
    public static void main(String[] args) {
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
        else if (votos4Queijos > votosMussarela && votos4Queijos > votosCalabresa)
            System.out.println("Quatro Queijos é favorita");
        else if (votosCalabresa == votos4Queijos)
            System.out.println("Calabresa e 4 Queijos empataram");
        else if (votosCalabresa == votosMussarela)
            System.out.println("Calabresa e Mussarela empataram");
        else
            System.out.println("Mussarela e 4 queijos empataram");
    }
}
