package sobrecargaMetodo;

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        System.out.println("Resultado: " + c.somar(1, 2));
        System.out.println("Resultado: " + c.somar(1.5, 4));
        System.out.println("Resultado: " + c.somar(1, 3, 5));
    }
}
