package br.edu.poo.jogoTiro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Arma ak47 = new Arma("AK-47", 30);
        Arma pistola = new Arma("Pistola", 15);
        Arma sniper = new Arma("Sniper", 5);
        Arma granada = new Arma("Granada", 1);

        Jogador jogador1 = new Jogador("Carlos");
        Jogador jogador2 = new Jogador("Mariana");

        jogador1.equiparArma(ak47);
        jogador1.equiparArma(pistola);
        jogador1.equiparArma(sniper);
        jogador1.equiparArma(granada);

        jogador2.equiparArma(pistola);
        jogador2.equiparArma(granada);

        List<Jogador> jogadoresEquipe = new ArrayList<>();
        jogadoresEquipe.add(jogador1);
        jogadoresEquipe.add(jogador2);

        Equipe equipeAlpha = new Equipe("Alpha", jogadoresEquipe);

        equipeAlpha.mostrarEquipe();
    }
}
