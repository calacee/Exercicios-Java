package school.sptech;

public class Potencia {
    public static void main(String[] args) {
        Integer base, expoente, multiplicacao;
        base = 2;
        expoente = 5;
        multiplicacao = 1;
        for (int i = 0;i < expoente; i++){
            multiplicacao *= base;
        }
        System.out.println(multiplicacao);
    }
}
