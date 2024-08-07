package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("Dicionário vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            return dicionarioMap.get(palavra);
        } else {
            return null;
        }
    }

    // Testes
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Cachorro", "Animal de estimação");
        dicionario.adicionarPalavra("Computador", "Dispositivo eletrônico");
        dicionario.adicionarPalavra("Carro", "Veículo automotor");
        dicionario.adicionarPalavra("Casa", "Moradia");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Carro");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Cachorro"));
    }

}
