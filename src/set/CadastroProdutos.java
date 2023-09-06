package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<Produto>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtos.add(new Produto(nome, preco, quantidade, cod));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosOrdenados = new TreeSet<Produto>(produtos);
        return produtosOrdenados;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosOrdenados = new TreeSet<Produto>(new ComparatorPreco());
        produtosOrdenados.addAll(produtos);
        return produtosOrdenados;
    }
}

class ComparatorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}