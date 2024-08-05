package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    public List<Item> listaItems;

    public CarrinhoDeCompras() {
        this.listaItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        listaItems.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item i : listaItems) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(i);
            }
        }
        listaItems.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item i : listaItems){
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(this.listaItems);
    }

    
// Testes
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Arroz", 10.0, 2);
        carrinho.adicionarItem("Feijão", 8.0, 1);

        carrinho.exibirItens();
        System.out.println("Valor total: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Arroz");
        carrinho.exibirItens();
        System.out.println("Valor total: " + carrinho.calcularValorTotal());
    }
}
