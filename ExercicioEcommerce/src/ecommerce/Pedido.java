package ecommerce;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private int pedido;
    private Cliente cliente;
    private List<Produto> produtos;
    private String status;

    public Pedido(int pedido, Cliente cliente, List<Produto> produtos) {
        this.pedido = pedido;
        this.cliente = cliente;
        this.produtos = (produtos != null) ? produtos : new ArrayList<>();
    }

    public int getId() {
        return pedido;
    }

    public String getCliente() {
        return cliente.getNome();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotalPedido() {
        double precoFinal = 0;

        for (Produto p: produtos) {
            precoFinal += p.calcularPrecoFinal();
        }

        return precoFinal;
    }
}
