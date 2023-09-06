package map;

import java.util.*;

public class LivrariaOnline {

    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        for (Livro livro : livros.values()) {
            if (livro.getTitulo().equals(titulo)) {
                livros.remove(livro);
                break;
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        return new TreeMap<String, Livro>(livros);
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), entry.getValue());
            }
        }

        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;

        for (Livro livro : livros.values()) {
            if (livroMaisCaro == null || livro.getPreco() > livroMaisCaro.getPreco()) {
                livroMaisCaro = livro;
            }
        }

        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato() {
        Livro livroMaisBarato = null;

        for (Livro livro : livros.values()) {
            if (livroMaisBarato == null || livro.getPreco() < livroMaisBarato.getPreco()) {
                livroMaisBarato = livro;
            }
        }

        return livroMaisBarato;
    }
}
