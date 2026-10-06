package br.edu.poo.jogoTiro;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Arma> armas;

    public Jogador(String nome) {
        this.nome = nome;
        this.armas = new ArrayList<>();
    }

    public void equiparArma(Arma arma) {
        if (armas.size() < 3) {
            armas.add(arma);
            System.out.println(nome + " equipou a arma: " + arma.getNome());
        } else {
            System.out.println(nome + " já possui 3 armas equipadas. Não é possível equipar " + arma.getNome());
        }
    }

    public void mostrarArmas() {
        System.out.println("Jogador: " + nome);
        for (Arma a: armas) {
            System.out.println("- " + a.getNome());
            a.mostrarMunicao();
        }
    }
}
