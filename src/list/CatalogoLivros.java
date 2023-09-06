package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoLivros {

    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.listaLivros.add(new Livro(autor, titulo, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        return this.listaLivros.stream().filter(l -> l.getAutor() == autor).collect(Collectors.toList());
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        return this.listaLivros.stream().filter(l -> l.getAnoLancamento() >= anoInicial && l.getAnoLancamento() <= anoFinal).collect(Collectors.toList());
    }

    public Livro pesquisarPorTitulo(String titulo) {
        return this.listaLivros.stream().filter(l -> l.getTitulo() == titulo).findFirst().get();
    }

}
