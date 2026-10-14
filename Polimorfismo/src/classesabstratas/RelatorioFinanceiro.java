package classesabstratas;

public class RelatorioFinanceiro extends Relatorio {

    public RelatorioFinanceiro() {
        super("Relatório Financeiro");
    }

    @Override
    public void gerar() {
        exibirCabecalho();
        System.out.println("Receita Total: R$ 15.000,00");
        System.out.println("Despesas: R$ 8.500,00");
        System.out.println("Lucro Líquido: R$ 6.500,00");
        exibirRodape();
    }
}
