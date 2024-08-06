package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        if (convidadoParaRemover != null) {
            convidadoSet.remove(convidadoParaRemover);
        }else {
            System.out.println("Convidado não encontrado");
        }
    }

    public int contarConvidados() {
        return convidadoSet.size();

    }

    public void exibirConvidados() {
        for (Convidado c : convidadoSet) {
            System.out.println(c);
        }
    }


    //Testes
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("João", 1);
        conjuntoConvidados.adicionarConvidado("Maria", 2);
        conjuntoConvidados.adicionarConvidado("José", 3);
        conjuntoConvidados.adicionarConvidado("Ana", 4);
        conjuntoConvidados.adicionarConvidado("Pedro", 5);
        conjuntoConvidados.adicionarConvidado("Paula", 6);
        conjuntoConvidados.adicionarConvidado("Carlos", 7);
        conjuntoConvidados.adicionarConvidado("Marta", 8);
        conjuntoConvidados.adicionarConvidado("Lucas", 9);
        conjuntoConvidados.adicionarConvidado("Júlia", 10);

        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(5);
        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(11);
        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
    }

}
