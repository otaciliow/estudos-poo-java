package ecommerce;

public class ProdutoDigital extends Produto {
    private double tamanhoEmMegabytes;
    private String linkDownload;

    public ProdutoDigital(String nome, double preco, String codigo, double tamanhoEmMegabytes, String linkDownload) {
        super(nome, preco, codigo);
        this.tamanhoEmMegabytes = tamanhoEmMegabytes;
        this.linkDownload = linkDownload;
    }

    public double getTamanhoEmMegabytes() {
        return tamanhoEmMegabytes;
    }

    public void setTamanhoEmMegabytes(double novoTamanhoEmMegabytes) {
        if (novoTamanhoEmMegabytes > 0) {
            this.tamanhoEmMegabytes = novoTamanhoEmMegabytes;
        }
    }

    public String getLinkDownload() {
        return linkDownload;
    }

    public void setLinkDownload(String novoLinkDownload) {
        if (novoLinkDownload != null && !novoLinkDownload.isBlank()) {
            this.linkDownload = novoLinkDownload;
        }
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.90;
    }
}
