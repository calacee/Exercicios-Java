package school.sptech;

public class ExercicioMetodos {
    Boolean verificarMaioridade(Integer idade){
        return idade >= 18;
    }
    Double calcularMedia(Double valor1, Double valor2, Double valor3) {
        return (valor1 + valor2 + valor3)/3;
    }
    Integer maiorNumero(Integer valor1, Integer valor2, Integer valor3){
        Integer maior = valor1;
        if(valor2 > maior)
            maior = valor2;
        if(valor3 > maior)
            maior = valor3;
        return maior;
    }
    Integer calcularFatorial(Integer valor){
        Integer fatorial = 1;
        for (; valor > 0 ; valor--) {
            fatorial *= valor;
        }
        return fatorial;
    }
    Boolean verificarPrimo(Integer valor){
        if (valor <= 1)
            return false;
        int contadorDivisoes = 0;
        for(int i = valor; i > 0; i--){
            if (valor%i == 0)
                contadorDivisoes ++;
        }
        if(contadorDivisoes > 2){
            return false;
        }
        return true;
    }
    Integer calcularPotencia(Integer base, Integer expoente){
        int aux = 1;

        for (int i = 0; i < expoente; i++) {
            aux *= base;
        }
        return aux;
    }
    Integer calcularTrocoEmBalas(Double valorCompra, Double valorRecebido){
        if (valorCompra >= valorRecebido)
            return 0;
        Double balas = (valorRecebido - valorCompra) / 0.25;
        Integer qtdBalas = 0;
        qtdBalas = balas.intValue();
        return qtdBalas;
    }
    Boolean verificarPalindromo(String palavra){
        String palavraLimpa = palavra.replaceAll(" ", "").toLowerCase();
        int qtdLetras = palavraLimpa.length();
        for (int i = 0; i < qtdLetras; i++){
            if(palavraLimpa.charAt(i) == palavraLimpa.charAt(qtdLetras - 1))
                qtdLetras --;
            else
                return false;
        }
        return true;
    }
}
