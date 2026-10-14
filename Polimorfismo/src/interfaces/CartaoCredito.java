package interfaces;

public class CartaoCredito implements Pagamento {
    private double valorPago;

    @Override
    public void processarPagamento(double valor) {
        valorPago = valor;
        System.out.println("Pagamento de R$ " + valorPago + " processado via Cartão de Crédito");
    }

    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante: Cartão de Crédito - Valor: R$ " + valorPago);
    }
}
