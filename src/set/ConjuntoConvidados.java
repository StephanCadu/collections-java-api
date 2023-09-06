package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<Convidado>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        convidados.removeIf(c -> c.getCodigoConvite() == codigoConvite);
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        convidados.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();

        conjunto.adicionarConvidado("nome1", 111);
        conjunto.adicionarConvidado("nome2", 222);
        conjunto.adicionarConvidado("nome3", 333);
        conjunto.adicionarConvidado("nome4", 444);

        System.out.println("CONVIDADOS ADICIONADOS: ");
        conjunto.exibirConvidados();

        System.out.println("REMOVENDO CONVIDADO 333: ");
        conjunto.removerConvidadoPorCodigoConvite(333);

        conjunto.exibirConvidados();

        System.out.println("QUANTIDADE DE CONVIDADOS: " + conjunto.contarConvidados());
    }
}
