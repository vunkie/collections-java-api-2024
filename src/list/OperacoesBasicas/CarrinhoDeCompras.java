package list.OperacoesBasicas;

import java.util.List;

public class CarrinhoDeCompras {

    public List<Item> listaItems;

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItems.add(new Item(nome, preco, quantidade));
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
        System.out.println(listaItems);
    }
}
