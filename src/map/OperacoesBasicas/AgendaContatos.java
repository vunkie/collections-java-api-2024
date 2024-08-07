package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatoMap;

    public AgendaContatos() {
        this.contatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!contatoMap.isEmpty()) {
            contatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        if (!contatoMap.isEmpty()) {
            System.out.println(contatoMap);
        } else {
            System.out.println("Agenda vazia!");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        if (!contatoMap.isEmpty()) {
            return contatoMap.get(nome);
        } else {
            return null;
        }
    }


    //Testes
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("José", 456789123);
        agenda.exibirContatos();
        agenda.removerContato("Maria");
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("João"));
    }

}
