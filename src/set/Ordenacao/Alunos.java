package set.Ordenacao;

import java.util.Comparator;

public class Alunos implements Comparable<Alunos> {
    private String nome;
    private long matricula;
    private double media;
    public Alunos(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }
    public String getNome() {
        return nome;
    }
    public long getMatricula() {
        return matricula;
    }
    public double getMedia() {
        return media;
    }
    @Override
    public String toString() {
        return "Alunos [nome=" + nome + ", matricula=" + matricula + ", media=" + media + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (matricula ^ (matricula >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alunos other = (Alunos) obj;
        if (matricula != other.matricula)
            return false;
        return true;
    }
    @Override
    public int compareTo(Alunos a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    

}

class ComparatorPorMedia implements Comparator<Alunos> {
    @Override
    public int compare(Alunos aluno1, Alunos aluno2) {
        return Double.compare(aluno1.getMedia(), aluno2.getMedia());
    }
}