package br.edu.poo.hortifruti;

public class Main {
    public static void main(String[] args) {
        Fruta maca = new Fruta("Maçã", 4.50, 120, "Vermelha");
        Fruta uva = new Fruta("Uva", 7.00, 50, "Roxa");
        Verdura alface = new Verdura("Alface", 3.00, 80, true);

        maca.exibirDetalhes();
        uva.exibirDetalhes();
        alface.exibirDetalhes();
    }
}
