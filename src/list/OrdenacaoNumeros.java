package list;

import java.util.*;

public class OrdenacaoNumeros {

    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<Integer>();
    }

    public void ordenarAscendente() {
        Collections.sort(this.numeros, (n1, n2) -> Integer.compare(n1, n2));
    }

    public void ordenarDescendente() {
        Collections.sort(this.numeros, (n1, n2) -> Integer.compare(n2, n1));
    }

    public static void main(String[] args) {
        OrdenacaoNumeros order = new OrdenacaoNumeros();

        order.numeros.add(3);
        order.numeros.add(14);
        order.numeros.add(2);
        order.numeros.add(6);
        order.numeros.add(90);

        order.ordenarAscendente();

        System.out.println("LISTA ORDENADA ASCENDENTE");
        System.out.println(order.numeros);

        order.ordenarDescendente();

        System.out.println("LISTA ORDENADA DESCENDENTE");
        System.out.println(order.numeros);
    }
}
