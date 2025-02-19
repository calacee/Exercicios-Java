package school.sptech;

public class ContadorVariado {
    public static void main(String[] args) {
//        Crie uma classe chamada ContadorVariado que:
//
//        Usando for, começe exibindo o valor 0.15 e depois 0.30, depois 0.45, depois 0.60...
//        ou seja, aumente de 0.15 em 0.15 a cada iteração até que o último número seja menor que 5.
        for(double i = 0.15; i < 5.0; i+= 0.15){
            System.out.printf("%.2f\n",i);
        }
    }
}
