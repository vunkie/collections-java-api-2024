package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        for (Alunos aluno : alunosSet) {
            if(aluno.getMatricula() == matricula){
                alunosSet.remove(aluno);
                break;
            }
        }
    }

    public Set<Alunos> exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Alunos> exibirAlunosPorNota(){
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorPorMedia());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }


    //Testes
    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.adicionarAluno("João", 1234567890L, 7.5);
        gerenciador.adicionarAluno("Maria", 9876543210L, 8.2);
        gerenciador.adicionarAluno("Pedro", 2468135790L, 6.9);
        gerenciador.adicionarAluno("Ana", 1357924680L, 9.1);
        gerenciador.adicionarAluno("Carlos", 8642097531L, 8.7);

        System.out.println("Alunos por nome:" + gerenciador.exibirAlunosPorNome());

        System.out.println("\nAlunos por nota:" + gerenciador.exibirAlunosPorNota());

        gerenciador.removerAluno(2468135790L);
        gerenciador.exibirAlunos();
    }

}
