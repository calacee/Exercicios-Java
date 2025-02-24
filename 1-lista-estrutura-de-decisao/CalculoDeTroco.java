package school.sptech;

public class CalculoDeTroco {
    public static void main(String[] args) {
        Double valorProduto = 30.0;
        Integer quantidadeVendida = 2;
        Double valorPago = 70.0;
        Double troco = valorPago - (valorProduto * quantidadeVendida.doubleValue());
        if(troco < 0){
            System.out.println("Dinheiro insuficiente para o produto");
            System.exit(0);
        }
        System.out.printf("Seu troco será de R$%.2f", troco);
    }
}
