package sobreescritaMetodo;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        carro.calcularTempoEntrega(120);

        Veiculo moto = new Moto();
        moto.calcularTempoEntrega(120);
    }
}
