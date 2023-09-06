package map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> produtos;

    public EstoqueProdutos() {
        this.produtos = new HashMap<Long, Produto>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(produtos);
    }

    public double calcularValorTotalEstoque() {
        double total = 0;

        if (!produtos.isEmpty()) {
            for (Produto p : produtos.values()) {
                total += p.getPreco() * p.getPreco();
            }
        }

        return total;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;

        if (!produtos.isEmpty()) {
            for (Produto p : produtos.values()) {
                if (produtoMaisCaro == null || p.getPreco() > produtoMaisCaro.getPreco()) {
                    produtoMaisCaro = p;
                }
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;

        if (!produtos.isEmpty()) {
            for (Produto p : produtos.values()) {
                if (produtoMaisBarato == null || p.getPreco() < produtoMaisBarato.getPreco()) {
                    produtoMaisBarato = p;
                }
            }
        }

        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidade = null;

        if (!produtos.isEmpty()) {
            for (Produto p : produtos.values()) {
                if (produtoMaiorQuantidade == null || p.getQuantidade() * p.getPreco() > produtoMaiorQuantidade.getQuantidade() * produtoMaiorQuantidade.getPreco()) {
                    produtoMaiorQuantidade = p;
                }
            }
        }

        return produtoMaiorQuantidade;
    }
}
