package list;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        return this.numeros.stream().reduce(Integer::sum).get();
    }

    public int encontrarMaiorNumero() {
        return this.numeros.stream().max(Integer::compare).get();
    }

    public int encontrarMenorNumero() {
        return this.numeros.stream().min(Integer::compare).get();
    }

    public List<Integer> exibirNumeros() {
        return this.numeros;
    }
}
