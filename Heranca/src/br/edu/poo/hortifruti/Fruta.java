package br.edu.poo.hortifruti;

public class Fruta extends Produto {
    private String cor;

    public Fruta(String nome, double preco, int quantidade, String cor) {
        super(nome, preco, quantidade);
        this.cor = cor;
    }

    public void exibirDetalhes() {
        super.exibirInfo();
        System.out.println("Cor: " + cor);
    }
}
