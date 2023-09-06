package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoas.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade() {
        this.pessoas.sort(Comparator.comparing(Pessoa::getIdade));
    }

    public void ordenarPorAltura() {
        this.pessoas.sort(Comparator.comparing(Pessoa::getAltura));
    }

    public static void main(String[] args) {
        OrdenacaoPessoas order = new OrdenacaoPessoas();

        order.adicionarPessoa("nome", 12, 1.65);
        order.adicionarPessoa("nome1", 55, 1.90);
        order.adicionarPessoa("nome2", 90, 1.77);
        order.adicionarPessoa("nome3", 15, 1.78);
        order.adicionarPessoa("nome4", 34, 2.02);

        order.ordenarPorIdade();

        System.out.println("LISTA ORDENADA POR IDADE");
        System.out.println(order.pessoas);

        order.ordenarPorAltura();

        System.out.println("LISTA ORDENADA POR ALTURA");
        System.out.println(order.pessoas);
    }
}
