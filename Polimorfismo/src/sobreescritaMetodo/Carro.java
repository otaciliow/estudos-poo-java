package sobreescritaMetodo;

public class Carro extends Veiculo {
    @Override
    public void calcularTempoEntrega(double distancia) {
        double tempo = distancia / 60;
        System.out.println("Tempo estimado de entrega com carro: " + tempo + " horas.");
    }
}
