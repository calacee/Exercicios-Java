package school.sptech;

public class Calorias {
    public static void main(String[] args) {
        Integer aquecimento, aerobicos, musculacao, totalMinutos, calorias;
        aquecimento = 3;
        aerobicos = 7;
        musculacao =  2;
        totalMinutos = aquecimento + aerobicos + musculacao;
        calorias = (aquecimento * 12) + (aerobicos * 20) + (musculacao * 25);
        System.out.printf("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias", totalMinutos, calorias);
    }
}