package br.edu.poo.game;

public class Personagem {
    public String nome;
    private int vida;
    protected int nivel;
    int poder;

    public Personagem(String nome, int vida, int nivel, int poder) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.poder = poder;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida >= 0) {
            this.vida = vida;
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel > 0) {
            this.nivel = nivel;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        if (poder >= 0) {
            this.poder = poder;
        }
    }

    protected void mensagemSecreta() {
        System.out.println("Mensagem secreta de " + nome);
    }

    public void atacar() {
        System.out.println(nome + " atacou com poder " + poder + "!");
    }
}
