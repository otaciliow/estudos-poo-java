package classesabstratas;

public class RelatorioVendas extends Relatorio {

    public RelatorioVendas() {
        super("Relatório Vendas");
    }

    @Override
    public void gerar() {
        exibirCabecalho();
        System.out.println("Total Vendas: 125");
        System.out.println("Clientes Atendidos: 89");
        System.out.println("Produto mais vendido: Notebook Gamer");
        exibirRodape();
    }
}
