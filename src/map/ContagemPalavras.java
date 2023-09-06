package map;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
     private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(palavras);
    }

    public Map.Entry<String, Integer> encontrarPalavraMaisFrequente() {
        Map.Entry<String, Integer> maisFrequente = null;

        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (maisFrequente == null || entry.getValue() > maisFrequente.getValue()) {
                maisFrequente = entry;
            }
        }

        return maisFrequente;
    }
}
