package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> produtoMap;

    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(produtoMap);
    }

    public double calcularValorTotalEstoque() {
        double total = 0d;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                total += p.getPreco() * p.getQuantidade();
            }
        }
        return total;
    }

    public Produto obterProdutoMaisCaro() {
        Produto maisCaro = null;
        double preco = Double.MIN_VALUE;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                if (p.getPreco() > preco) {
                    preco = p.getPreco();
                    maisCaro = p;
                }
            }
        }
        return maisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto maisBarato = null;
        double preco = Double.MAX_VALUE;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                if (p.getPreco() < preco) {
                    preco = p.getPreco();
                    maisBarato = p;
                }
            }
        }
        return maisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto maiorQuantidadeValorTotal = null;
        double valorTotal = Double.MIN_VALUE;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                double total = p.getPreco() * p.getQuantidade();
                if (total > valorTotal) {
                    valorTotal = total;
                    maiorQuantidadeValorTotal = p;
                }
            }
        }
        return maiorQuantidadeValorTotal;
    }

    // Testes
    public static void main(String[] args) {
        EstoqueProdutos e = new EstoqueProdutos();
        e.adicionarProduto(1, "Arroz", 10, 5.0);
        e.adicionarProduto(2, "Feijão", 5, 7.0);
        e.adicionarProduto(3, "Macarrão", 15, 3.0);
        e.adicionarProduto(4, "Açucar", 20, 2.0);
        e.adicionarProduto(5, "Café", 10, 10.0);
        e.exibirProdutos();
        System.out.println("Valor total do estoque: " + e.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + e.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + e.obterProdutoMaisBarato());
        System.out.println("Produto com maior quantidade e valor total no estoque: "
                + e.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }

}
