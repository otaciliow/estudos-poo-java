package recuperarSenha;

public class Main {
    public static void main(String[] args) {
        String codigo = GeradorCodigo.gerarToken(10);
        System.out.println("Código gerado: " + codigo);
    }
}
