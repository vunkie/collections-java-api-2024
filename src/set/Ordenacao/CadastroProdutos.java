package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }


    //Testes
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(1, "Produto 1", 100, 10);
        cadastro.adicionarProduto(2, "Produto 2", 200, 20);
        cadastro.adicionarProduto(3, "Produto 3", 300, 30);
        cadastro.adicionarProduto(4, "Produto 4", 400, 40);
        cadastro.adicionarProduto(5, "Produto 5", 500, 50);

        System.out.println("Produtos por nome:");
        for (Produto produto : cadastro.exibirProdutosPorNome()) {
            System.out.println(produto);
        }

        System.out.println("\nProdutos por preço:");
        for (Produto produto : cadastro.exibirProdutosPorPreco()) {
            System.out.println(produto);
        }
    }

}
