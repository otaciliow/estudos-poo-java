package interfaces;

public class Pix implements Pagamento{
    private double valorPago;

    @Override
    public void processarPagamento(double valor) {
        valorPago = valor;
        System.out.println("Pagamento de R$ " + valorPago + " processado via Pix");
    }

    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante: Pix - Valor: R$ " + valorPago);
    }
}
