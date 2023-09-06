package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarrinhoCompras {

    private List<Item> carrinho;

    public CarrinhoCompras() {
        this.carrinho = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        this.carrinho = this.carrinho.stream().filter(i -> i.getNome() == nome).collect(Collectors.toList());
    }

    public double calcularValorTotal() {
        return this.carrinho.stream().map(i -> i.getPreco() * i.getQuantidade()).reduce(0.0, Double::sum);
    }

    public void exibirItens() {
        this.carrinho.stream().forEach(System.out::println);
    }
}
