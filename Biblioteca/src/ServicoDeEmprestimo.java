public class ServicoDeEmprestimo {

    public void emprestarLivro(Leitor leitor, Livro livro) {
        if (livro.getLeitorAtual() == null) {
            livro.setLeitorAtual(leitor);
            leitor.adicionarLivro(livro);
            System.out.println("Livro " + livro.getTitulo() + " emprestado para " + leitor.getNome());
        } else {
            System.out.println("Erro ao emprestar o livro " + livro.getTitulo() + " para " + leitor.getNome() + ":");
            System.out.println("- Livro já está emprestado para " + livro.getLeitorAtual().getNome());
        }
    }
}