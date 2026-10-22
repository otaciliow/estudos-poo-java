package singleton;

public class BancoDeDados {
    private static BancoDeDados instancia = null;

    private BancoDeDados() {
        System.out.println("Conexão com o banco criada.");
    }

    public static BancoDeDados getInstancia() {
        if (instancia ==  null) {
            instancia = new BancoDeDados();
        }
        return instancia;
    }

    public void consultar(String query) {
        System.out.println("Executando query: " + query);
    }
}
