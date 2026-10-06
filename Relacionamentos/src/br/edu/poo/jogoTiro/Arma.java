package br.edu.poo.jogoTiro;

public class Arma {
    private String nome;
    private Municao municao;

    public Arma(String nome, int quantidadeMunicao) {
        this.nome = nome;
        this.municao = new Municao(quantidadeMunicao);
    }

    public String getNome(){
        return nome;
    }

    public void mostrarMunicao() {
        System.out.println("Munição restante: " + municao.getQuantidade());
    }
}
