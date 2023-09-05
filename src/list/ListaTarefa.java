package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTarefa {

    private List<Tarefa> listaTarefas;

    public ListaTarefa() {
        this.listaTarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
       // solução 1
        listaTarefas = listaTarefas.stream().filter(t -> !t.getDescricao().equalsIgnoreCase(descricao)).collect(Collectors.toList());

        // solução 2
        //        List<Tarefa> tarefasParaRemover = new ArrayList<Tarefa>();
        //
        //        for(Tarefa t : listaTarefas) {
        //            if (t.getDescricao().equalsIgnoreCase(descricao)) {
        //                tarefasParaRemover.add(t);
        //            }
        //        }
        //
        //        listaTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas() {
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(listaTarefas);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 3");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.removerTarefa("Tarefa 3");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

}
