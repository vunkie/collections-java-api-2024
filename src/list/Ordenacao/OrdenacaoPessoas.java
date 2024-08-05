package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        Pessoa p = new Pessoa(nome, idade, altura);
        listaPessoas.add(p);
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    //Testes
    public static void main(String[] args) {
        
        OrdenacaoPessoas op = new OrdenacaoPessoas();
        op.adicionarPessoa("João", 25, 1.75);
        op.adicionarPessoa("Maria", 30, 1.65);
        op.adicionarPessoa("Pedro", 20, 1.80);
        op.adicionarPessoa("Ana", 35, 1.70);

        System.out.println("Ordenação por idade: " + op.ordenarPorIdade());
        System.out.println("Ordenação por altura: " + op.ordenarPorAltura());



        

    }
}
