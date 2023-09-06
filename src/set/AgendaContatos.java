package set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> agenda;

    public AgendaContatos() {
        this.agenda = new HashSet<Contato>();
    }

    public void adicionarContato(String nome, int numero) {
        agenda.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(agenda);
    }

    public int pesquisarPorNome(String nome) {
        return (int) agenda.stream().filter(c -> c.getNome().startsWith(nome)).count();
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;

        for (Contato contato : agenda) {
            if (contato.getNome().equals(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {

    }
}
