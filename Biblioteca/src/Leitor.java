import java.util.ArrayList;
import java.util.List;

public class Leitor {
    private String nome;
    private List<Livro> livrosEmprestados;

    public Leitor(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public String getNome() {
        return nome;
    }
}