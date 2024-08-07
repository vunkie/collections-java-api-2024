package map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));

    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        // Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        // return eventosTreeMap.get(eventosTreeMap.keySet().iterator().next());
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> evento : eventosTreeMap.entrySet()) {
            if (evento.getKey().isAfter(dataAtual) || evento.getKey().isEqual(dataAtual)) {
                System.out.println("O próximo evento é: " + evento.getValue() + " na data " + evento.getKey());
                break;
            }

        }
    }

    // Testes
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2024, 5, 15), "Concert", "John Mayer");
        agenda.adicionarEvento(LocalDate.of(2024, 10, 20), "Conference", "Tech Summit");
        agenda.adicionarEvento(LocalDate.of(2024, 7, 25), "Party", "Halloween");

        agenda.exibirAgenda();

        agenda.obterProximoEvento();
    }

}
