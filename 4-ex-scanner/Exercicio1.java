package school.sptech;

import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome do aluno:");
    String nomeAluno = scanner.nextLine();
    System.out.println("Digite quantas provas foram feitas:");
    Integer qtdProvas = scanner.nextInt();
    Integer somatorioNotas = 0;
    for(int i = 0; i < qtdProvas; i++){
      System.out.printf("Digite a nota da %d prova\n", (i+1));
      Integer notaProva = scanner.nextInt();
      somatorioNotas += notaProva;
    }
    Double media = somatorioNotas.doubleValue() / qtdProvas.doubleValue();
    System.out.printf("Aluno:%s\n", nomeAluno);
    System.out.printf("Media:%.2f", media);
  }
}