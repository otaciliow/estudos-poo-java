package singleton;

public class Main {
    public static void main(String[] args) {
        BancoDeDados bd1 = BancoDeDados.getInstancia();
        BancoDeDados bd2 = BancoDeDados.getInstancia();

        bd1.consultar("SELECT * FROM usuarios");

        System.out.println(bd1 == bd2);
    }
}
