package sobreescritaMetodo;

public class Moto extends Veiculo {
    @Override
    public void calcularTempoEntrega(double distancia) {
        double tempo = distancia / 80;
        System.out.println("Tempo estimado de entrega com moto: " + tempo + " horas.");
    }
}
