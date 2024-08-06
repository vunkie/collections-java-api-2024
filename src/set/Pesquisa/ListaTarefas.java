package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
        
    }

    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao, false);
        tarefaSet.add(tarefa);
    }

    public void removerTarefa(String descricao){
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaSet.remove(t);
                break;
            }
        }
    }

    public void exibirTarefas(){
        for (Tarefa t : tarefaSet) {
            System.out.println(t);
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }
    
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isFinalizada()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isFinalizada()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setFinalizada(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setFinalizada(false);
                break;
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    //Testes
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Python");
        listaTarefas.adicionarTarefa("Estudar JavaScript");
        listaTarefas.adicionarTarefa("Estudar HTML");
        listaTarefas.adicionarTarefa("Estudar CSS");
        listaTarefas.adicionarTarefa("Estudar SQL");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.marcarTarefaConcluida("Estudar Python");
        System.out.println("Qtde total " + listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());
        listaTarefas.limparListaTarefas();
        System.out.println("Qtde total" + listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();


    }

}
