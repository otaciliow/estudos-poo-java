package ecommerce;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jhon Doe", "jhon@doe.com", "123.456.789-00");

        Produto produto1 = new ProdutoFisico("Óculos de Sol", 50.25, "123456", 0.2, 10);
        Produto produto2 = new ProdutoFisico("Smart TV TCL 32 polegadas", 1000.00, "654321", 3.2, 70);
        Produto produto3 = new ProdutoDigital("World of Warcraft (Licença digital)", 159.90, "987123", 20000, "https://warcraft.com/wow/download");

        Pedido pedido = new Pedido(1, cliente1, new ArrayList<>());

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);

        System.out.println("====== Resumo do pedido ======");
        for (Produto p: pedido.getProdutos()) {
            System.out.println("Item: " + p.getNome() + " | Valor (com frete): " + p.calcularPrecoFinal());
        }
        System.out.println("\nTotal do Pedido: " + pedido.calcularTotalPedido());
    }
}
