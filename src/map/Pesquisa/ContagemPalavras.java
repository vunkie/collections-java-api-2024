package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra) {
        if (contagemPalavras.containsKey(palavra)) {
            contagemPalavras.put(palavra, contagemPalavras.get(palavra) + 1);
        } else {
            contagemPalavras.put(palavra, 1);
        }
    }

    public void removerPalavra(String palavra) {
        if (contagemPalavras.containsKey(palavra)) {
            contagemPalavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavras);
    }

    public int encontrarPalavraMaisFrequente(){
        int maiorFrequencia = 0;
        for (int frequencia : contagemPalavras.values()) {
            if (frequencia > maiorFrequencia) {
                maiorFrequencia = frequencia;
            }
        }
        return maiorFrequencia;
    }


    //Testes
    public static void main(String[] args) {
        ContagemPalavras cp = new ContagemPalavras();
        cp.adicionarPalavra("teste");
        cp.adicionarPalavra("teste");
        cp.adicionarPalavra("teste");
        cp.adicionarPalavra("teste");
        cp.adicionarPalavra("teste");
        cp.adicionarPalavra("teste");
        cp.adicionarPalavra("teste");
        cp.adicionarPalavra("teste");
        cp.adicionarPalavra("teste");
        cp.adicionarPalavra("teste");
        cp.adicionarPalavra("teste");
        cp.adicionarPalavra("teste2");
        cp.adicionarPalavra("teste2");
        cp.adicionarPalavra("teste2");
        cp.adicionarPalavra("teste2");
        cp.adicionarPalavra("teste2");
        cp.adicionarPalavra("teste2");
        cp.adicionarPalavra("teste2");
        cp.adicionarPalavra("teste2");
        cp.adicionarPalavra("teste2");
        cp.adicionarPalavra("teste2");
        cp.exibirContagemPalavras();
        System.out.println(cp.encontrarPalavraMaisFrequente());
        
    }


}
