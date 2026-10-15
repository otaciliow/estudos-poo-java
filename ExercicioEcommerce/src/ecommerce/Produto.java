package ecommerce;

abstract class Produto {
    private String nome;
    private double preco;
    private String codigo;

    public Produto(String nome, double preco, String codigo) {
        if (!nome.isBlank() && preco > 0 && !codigo.isBlank()) {
            this.nome = nome;
            this.preco = preco;
            this.codigo = codigo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        if (novoNome != null && !novoNome.isBlank()) {
            this.nome = novoNome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    abstract double calcularPrecoFinal();
}
