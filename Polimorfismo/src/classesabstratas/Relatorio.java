package classesabstratas;

import java.time.LocalDate;

abstract class Relatorio {
    protected String titulo;
    protected LocalDate dataGeracao;

    public Relatorio(String titulo) {
        this.titulo = titulo;
        this.dataGeracao = LocalDate.now();
    }

    public void exibirCabecalho() {
        System.out.println("==============================");
        System.out.println(titulo);
        System.out.println("Data de Geração: " + dataGeracao);
        System.out.println("==============================");
    }

    public abstract void gerar();

    public void exibirRodape() {
        System.out.println("==============================");
        System.out.println("✔ Relatório Finalizado.");
        System.out.println("==============================");
    }
}
