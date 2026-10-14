package interfaces;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new Pix();
        pagamento1.processarPagamento(150);
        pagamento1.exibirComprovante();

        Pagamento pagamento2 = new CartaoCredito();
        pagamento2.processarPagamento(200);
        pagamento2.exibirComprovante();
    }
}
