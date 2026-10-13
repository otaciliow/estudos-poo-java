import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Machado de Assis");
        Autor autor2 = new Autor("Clarice Lispector");

        Editora editora = new Editora("Companhia das Letras");

        Livro livro1 = new Livro("Dom Casmurro", 1899, Arrays.asList(autor1), editora);
        Livro livro2 = new Livro("A Hora da Estrela", 1977, Arrays.asList(autor2), editora);
        Livro livro3 = new Livro("Livro em Coautoria", 2024, Arrays.asList(autor1, autor2), editora);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        Leitor leitor = new Leitor("João Silva");

        ServicoDeEmprestimo servico = new ServicoDeEmprestimo();
        servico.emprestarLivro(leitor, livro1);
        servico.emprestarLivro(leitor, livro2);

        Leitor leitor2 = new Leitor("Maria Souza");

        servico.emprestarLivro(leitor2, livro1);

        System.out.println("\nLivros emprestados para " + leitor.getNome() + ":");
        for (Livro l: leitor.getLivrosEmprestados()) {
            System.out.println("- " + l.getTitulo());
        }
    }
}