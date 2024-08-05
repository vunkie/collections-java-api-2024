package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Num> numList;
    
    public SomaNumeros() {
        this.numList = new ArrayList<>();
    }

    public void adicionarNum(int num) {
        Num n = new Num(num);
        numList.add(n);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Num num : numList) {
            soma += num.getNum();
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = numList.get(0).getNum();
        for (Num num : numList) {
            if (num.getNum() > maior) {
                maior = num.getNum();
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = numList.get(0).getNum();
        for (Num num : numList) {
            if (num.getNum() < menor) {
                menor = num.getNum();
            }
        }
        return menor;
    }

    public List<Num> exibirNumeros() {
        List<Num> numeros = new ArrayList<>();
        for (Num num : numList) {
            numeros.add(num);
        }
        return numeros;
    }


    //Testes
    public static void main(String[] args) {
        SomaNumeros sn = new SomaNumeros();
        sn.adicionarNum(10);
        sn.adicionarNum(20);
        sn.adicionarNum(30);
        sn.adicionarNum(40);
        sn.adicionarNum(50);
        System.out.println(sn.calcularSoma());
        System.out.println(sn.encontrarMaiorNumero());
        System.out.println(sn.encontrarMenorNumero());
        System.out.println(sn.exibirNumeros());
    }

}
