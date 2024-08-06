package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone){
        contatoSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int telefone){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(telefone);
                contatoAtualizado = c;
                break;
            }
            
        }
        return contatoAtualizado;
    }

    //Testes
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Maria", 123456789);
        agenda.adicionarContato("João", 987654321);
        agenda.adicionarContato("José", 456789123);
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Jo"));
        System.out.println(agenda.atualizarContato("Maria", 987654321));
        agenda.exibirContatos();
    }

}
