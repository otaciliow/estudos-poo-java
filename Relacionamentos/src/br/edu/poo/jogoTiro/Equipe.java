package br.edu.poo.jogoTiro;

import java.util.List;

public class Equipe {
    private String nome;
    private List<Jogador> jogadores;

    public Equipe(String nome, List<Jogador> jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void mostrarEquipe() {
        System.out.println("\n=== Equipe: " + nome + " ===");
        if (jogadores.isEmpty()) {
            System.out.println("Nenhum jogador na equipe.");
        } else {
            for (Jogador j: jogadores) {
                j.mostrarArmas();
            }
        }
    }
}
