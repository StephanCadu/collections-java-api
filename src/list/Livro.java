package list;

public class Livro {
    private String autor;

    private String titulo;

    private int anoLancamento;

    public Livro(String autor, String titulo, int anoLancamento) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
