package ecommerce;

public class ProdutoFisico extends Produto {
    private double peso;
    private double taxaFrete;

    public ProdutoFisico(String nome, double preco, String codigo, double peso, double taxaFrete) {
        super(nome, preco, codigo);
        this.peso = peso;
        this.taxaFrete = taxaFrete;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double novoPeso) {
        if (novoPeso > 0) {
            this.peso = novoPeso;
        }
    }

    public double getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(double novaTaxaFrete) {
        if (novaTaxaFrete > 0) {
            this.taxaFrete = novaTaxaFrete;
        }
    }

    @Override
    public double calcularPrecoFinal() {
        double taxaPeso = (getPeso() > 1.0) ? ((getPeso() - 1.0) * 2.00) : 0.0;
        return (getPreco() + getTaxaFrete() + taxaPeso);
    }
}
