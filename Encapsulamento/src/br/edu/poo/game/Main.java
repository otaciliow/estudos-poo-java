package br.edu.poo.game;

public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Luna", 100, 1, 10);

        System.out.println("Nome do personagem: " + p1.nome);

        System.out.println("Vida inicial: " + p1.getVida());
        System.out.println(p1.nome + " sofreu dano e perdeu 20 de vida!");
        p1.setVida(80);
        System.out.println("Vida após dano: "+ p1.getVida());

        p1.setNivel(2);
        System.out.println(p1.nome + " foi para o nível " + p1.getNivel());

        p1.setPoder(15);
        System.out.println("Poder foi aumentado para " + p1.getPoder());

        p1.atacar();

        p1.mensagemSecreta();
    }
}
