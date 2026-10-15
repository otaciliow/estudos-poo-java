package ecommerce;

public class Cliente {
    private String nome;
    private String email;
    private String cpf;

    public Cliente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        if (novoNome != null && !novoNome.isBlank()) {
            this.nome = novoNome;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String novoEmail) {
        if (novoEmail != null && !novoEmail.isBlank()) {
            this.email = novoEmail;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String novoCpf) {
        if (novoCpf != null && !novoCpf.isBlank()) {
            this.cpf = novoCpf;
        }
    }
}
