package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        livroList.add(livro);
        // System.out.println("Livro adicionado com sucesso!");
        // System.out.println("Livro: " + titulo + "\n Autor: " + autor + "\n Ano de Publicação: " + anoPublicacao);
    }

    public void pesquisarPorAutor(String autor) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livrosEncontrados.add(l);
            }
        }
        System.out.println("Livros encontrados do autor " + autor + ": " + livrosEncontrados);
    }

    public void pesquisarPorIntervaloAnos(int anoInicio, int anoFim) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFim) {
                livrosEncontrados.add(l);
            }
        }
        System.out.println("Livros encontrados no intervalo de " + anoInicio + " até " + anoFim + ": " + livrosEncontrados);
    }

    public void pesquisarPorTitulo(String titulo) {
        Livro livroEncontrado = null;
        for (Livro l : livroList) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livroEncontrado = l;
                break;
            }
        }
        System.out.println("Livro encontrado : " + livroEncontrado);
    }

    // Testes
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Java Como Programar", "Deitel", 2015);
        catalogo.adicionarLivro("Java 8 Prático", "Casa do Código", 2016);
        catalogo.adicionarLivro("Spring Boot", "Casa do Código", 2017);
        catalogo.adicionarLivro("Java 8", "Deitel", 2014);

        catalogo.pesquisarPorAutor("Deitel");
        catalogo.pesquisarPorIntervaloAnos(2015, 2017);
        catalogo.pesquisarPorTitulo("Java 8");
    }
}
