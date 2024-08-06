package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasUnicasSet.remove(palavra);
    }

    public void verificarPalavra(String palavra){
        if(palavrasUnicasSet.contains(palavra)){
            System.out.println("A palavra " + palavra + " está no conjunto");
        }else{
            System.out.println("A palavra " + palavra + " não está no conjunto");
        }
    }

    public void exibirPalavrasUnicas(){
        for (String p : palavrasUnicasSet) {
            System.out.println(p);
        }
    }


    //Testes
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("João");
        conjuntoPalavrasUnicas.adicionarPalavra("Maria");
        conjuntoPalavrasUnicas.adicionarPalavra("José");
        conjuntoPalavrasUnicas.adicionarPalavra("Ana");
        conjuntoPalavrasUnicas.adicionarPalavra("Pedro");
        conjuntoPalavrasUnicas.adicionarPalavra("Paula");
        conjuntoPalavrasUnicas.adicionarPalavra("Carlos");
        conjuntoPalavrasUnicas.adicionarPalavra("Marta");
        conjuntoPalavrasUnicas.adicionarPalavra("Lucas");
        conjuntoPalavrasUnicas.adicionarPalavra("Júlia");

        System.out.println("Palavras únicas: ");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("Maria");
        conjuntoPalavrasUnicas.verificarPalavra("Marta");
        conjuntoPalavrasUnicas.removerPalavra("Maria");
        conjuntoPalavrasUnicas.verificarPalavra("Maria");
    }

}
