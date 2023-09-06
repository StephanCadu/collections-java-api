package set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaTarefas {

    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        tarefas.removeIf(t -> t.getDescricao().equals(descricao));
    }
    public void exibirTarefas() {
        System.out.println(tarefas);
    }
    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        return tarefas.stream().filter(t -> t.isConcluida()).collect(Collectors.toSet());
    }

    public Set<Tarefa> obterTarefasPendentes() {
        return tarefas.stream().filter(t -> !t.isConcluida()).collect(Collectors.toSet());
    }

    public void marcarTarefaConcluida(String descricao) {
        tarefas = tarefas.stream().map(t -> {
            if (t.getDescricao().equals(descricao)) {
                t.setConcluida(true);
            }
            return t;
        }).collect(Collectors.toSet());
    }

    public void marcarTarefaPendente(String descricao) {
        tarefas = tarefas.stream().map(t -> {
            if (t.getDescricao().equals(descricao)) {
                t.setConcluida(false);
            }
            return t;
        }).collect(Collectors.toSet());
    }

    public void limparListaTarefas() {
        tarefas.clear();
    }

}
