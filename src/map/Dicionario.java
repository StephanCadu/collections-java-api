package map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavras;

    public Dicionario() {
        this.palavras = new HashMap<String, String>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(palavras);
    }

    public String pesquisarPorPalavra(String palavra) {
        return palavras.get(palavra);
    }
}
