import java.util.Scanner;

public class SistemaVenda {
    private Produto produto;
    private Scanner scanner;

    public SistemaVenda() {
        scanner = new Scanner(System.in);
    }

    public void cadastrarProduto(String codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
        produto = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidadeEstoque);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public void realizarVenda(int quantidade, String metodoPagamento) {
        if (produto.vender(quantidade)) {
            double valorTotal = produto.getValor() * quantidade;
            double desconto = 0;

            if (metodoPagamento.equalsIgnoreCase("Pix") ||
                    metodoPagamento.equalsIgnoreCase("Espécie") ||
                    metodoPagamento.equalsIgnoreCase("Transferência") ||
                    metodoPagamento.equalsIgnoreCase("Débito")) {
                desconto = valorTotal * 0.05; // 5% de desconto
                valorTotal -= desconto;
            }

            System.out.println("Venda realizada com sucesso!");
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Valor total: R$ " + valorTotal);
            System.out.println("Desconto aplicado: R$ " + desconto);

            if (metodoPagamento.equalsIgnoreCase("Espécie")) {
                System.out.print("Valor pago: R$ ");
                double valorPago = scanner.nextDouble();
                if (valorPago > valorTotal) {
                    double troco = valorPago - valorTotal;
                    System.out.println("Troco: R$ " + troco);
                } else {
                    System.out.println("Valor pago insuficiente.");
                }
            }

        } else {
            System.out.println("Quantidade em estoque insuficiente!");
        }
    }

    public void exibirEstoque() {
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
    }
}