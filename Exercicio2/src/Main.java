import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SistemaVenda sistema = new SistemaVenda();
        Scanner scanner = new Scanner(System.in);

        // Cadastro de produto
        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o tamanho/peso do produto: ");
        String tamanhoPeso = scanner.nextLine();
        System.out.print("Digite a cor do produto: ");
        String cor = scanner.nextLine();
        System.out.print("Digite o valor do produto: R$ ");
        double valor = scanner.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();

        sistema.cadastrarProduto(codigo, nome, tamanhoPeso, cor, valor, quantidadeEstoque);

        // Realizar venda
        System.out.print("Digite a quantidade a ser vendida: ");
        int quantidadeVenda = scanner.nextInt();
        System.out.print("Digite o método de pagamento (Pix, Espécie, Transferência, Débito ou Crédito): ");
        scanner.nextLine();  // Limpa o buffer
        String metodoPagamento = scanner.nextLine();

        sistema.realizarVenda(quantidadeVenda, metodoPagamento);
        sistema.exibirEstoque();

        scanner.close();
    }
}