package school.sptech;

public class CalculoDeRenda {
    public static void main(String[] args) {
        Integer filhos0a3 = 1;
        Integer filhos4a16 = 3;
        Integer filhos17a18 = 2;
        Integer qtdFilhos = filhos0a3 + filhos4a16 + filhos17a18;
        Double bolsaFilhos = (filhos0a3 * 25.12) + (filhos4a16 * 15.88) + (filhos17a18 * 12.44);

        System.out.printf("Você tem um total de %d filhos e vai receber R$%.2f de bolsa", qtdFilhos, bolsaFilhos);
    }
}
