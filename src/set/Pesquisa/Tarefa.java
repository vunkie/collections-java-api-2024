package set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean finalizada;

    public Tarefa(String descricao, boolean finalizada) {
        this.descricao = descricao;
        this.finalizada = finalizada;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
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
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", finalizada=" + finalizada + "]";
    }

}
