package br.edu.poo.hortifruti;

public class Estoque {
    private int quantidade;

    public Estoque(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirEstoque() {
        System.out.println("Estoque disponível: " + quantidade + " unidades");
    }
}
