package map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<LocalDate, Evento>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        System.out.println(new TreeMap<>(eventos));
    }

    public Map.Entry<LocalDate, Evento> obterProximoEvento() {
        LocalDate now = LocalDate.now();
        Map.Entry<LocalDate, Evento> proximoEvento = null;

        for (Map.Entry<LocalDate, Evento> evento : eventos.entrySet()) {
            if (proximoEvento == null || (evento.getKey().isAfter(now) && evento.getKey().isBefore(proximoEvento.getKey()))) {
                proximoEvento = evento;
            }
        }

        return proximoEvento;
    }
}
