package br.edu.poo.hortifruti;

public class Verdura extends Produto {
    private boolean precisaRefrigeracao;

    public Verdura(String nome, double preco, int quantidade, boolean precisaRefrigeracao) {
        super(nome, preco, quantidade);
        this.precisaRefrigeracao = precisaRefrigeracao;
    }

    public void exibirDetalhes() {
        super.exibirInfo();
        System.out.println("Precisa refrigeração: " + (precisaRefrigeracao ? "Sim" : "Não"));
    }
}
