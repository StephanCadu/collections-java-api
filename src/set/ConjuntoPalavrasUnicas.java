package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<String>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        palavrasUnicas.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("aaa");
        conjunto.adicionarPalavra("bbb");
        conjunto.adicionarPalavra("ccc");
        conjunto.adicionarPalavra("ccc");
        conjunto.adicionarPalavra("ddd");

        System.out.println("EXIBINDO PALAVRAS:");
        conjunto.exibirPalavrasUnicas();

        System.out.println("VERIFICANDO PALAVRAS `ddd` e `eee`");
        System.out.println("ddd: " + conjunto.verificarPalavra("ddd") + " eee: " + conjunto.verificarPalavra("eee"));

        System.out.println("REMOVENDO PALAVRA `aaa`");
        conjunto.removerPalavra("aaa");

        System.out.println("EXIBINDO PALAVRAS:");
        conjunto.exibirPalavrasUnicas();
    }

}
