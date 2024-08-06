package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numeroAsc = new ArrayList<>(numeroList);
        Collections.sort(numeroAsc);
        return numeroAsc;

    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numeroDesc = new ArrayList<>(numeroList);
        Collections.sort(numeroDesc, Collections.reverseOrder());
        return numeroDesc;

    }

    //Testes
    public static void main(String[] args) {
        
        OrdenacaoNumeros on = new OrdenacaoNumeros();
        on.adicionarNumero(10);
        on.adicionarNumero(5);
        on.adicionarNumero(15);
        on.adicionarNumero(20);

        System.out.println("Ordenação ascendente: " + on.ordenarAscendente());
        System.out.println("Ordenação descendente: " + on.ordenarDescendente());
    }
}
