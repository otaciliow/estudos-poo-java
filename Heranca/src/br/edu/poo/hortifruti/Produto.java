package br.edu.poo.hortifruti;

public class Produto {
    protected String nome;
    protected double preco;
    protected Estoque estoque; // composição

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = new Estoque(quantidade);
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
        estoque.exibirEstoque();
    }
}
