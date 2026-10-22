package recuperarSenha;

import java.security.SecureRandom;

public class GeradorCodigo {
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final SecureRandom random = new SecureRandom();

    public static String gerarToken(int tamanho) {
        StringBuilder token = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(CARACTERES.length());
            token.append(CARACTERES.charAt(indice));
        }

        return token.toString();
    }
}
