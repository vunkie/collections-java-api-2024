package map.Ordenacao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livroMap.put(link, new Livro(titulo, autor, preco));
    }
    
    public void removerLivro(String titulo){
        for (Map.Entry<String, Livro> livro : livroMap.entrySet()) {
            if (livro.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                livroMap.remove(livro.getKey());
                break;
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        Map<String, Livro> sortedMap = new TreeMap<>((livro1, livro2) -> {
            double preco1 = livro1.getValue().getPreco();
            double preco2 = livro2.getValue().getPreco();
            return Double.compare(preco1, preco2);
        });

        sortedMap.putAll(livroMap);

        return sortedMap;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> result = new HashMap<>();

        for (Map.Entry<String, Livro> livro : livroMap.entrySet()) {
            if (livro.getValue().getAutor().equalsIgnoreCase(autor)) {
                result.put(livro.getKey(), livro.getValue());
            }
        }

        return result;
    }

    public Map<String, Livro> obterLivroMaisCaro(){
        double maxPreco = Double.MIN_VALUE;
        Map<String, Livro> result = new HashMap<>();

        for (Map.Entry<String, Livro> livro : livroMap.entrySet()) {
            double preco = livro.getValue().getPreco();
            if (preco > maxPreco) {
                maxPreco = preco;
                result.clear();
                result.put(livro.getKey(), livro.getValue());
            } else if (preco == maxPreco) {
                result.put(livro.getKey(), livro.getValue());
            }
        }

        return result;
    }

    public Map<String, Livro> exibirLivroMaisBarato(){
        double minPreco = Double.MAX_VALUE;
        Map<String, Livro> result = new HashMap<>();

        for (Map.Entry<String, Livro> livro : livroMap.entrySet()) {
            double preco = livro.getValue().getPreco();
            if (preco < minPreco) {
                minPreco = preco;
                result.clear();
                result.put(livro.getKey(), livro.getValue());
            } else if (preco == minPreco) {
                result.put(livro.getKey(), livro.getValue());
            }
        }

        return result;
    }

    //Testes
    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("https://www.livraria.com/livro1", "Livro 1", "Autor 1", 100.0);
        livraria.adicionarLivro("https://www.livraria.com/livro2", "Livro 2", "Autor 2", 200.0);
        livraria.adicionarLivro("https://www.livraria.com/livro3", "Livro 3", "Autor 1", 300.0);
        livraria.adicionarLivro("https://www.livraria.com/livro4", "Livro 4", "Autor 2", 400.0);
        livraria.adicionarLivro("https://www.livraria.com/livro5", "Livro 5", "Autor 1", 500.0);

        System.out.println("Livros ordenados por preço:");
        for (Map.Entry<String, Livro> livro : livraria.exibirLivrosOrdenadosPorPreco().entrySet()) {
            System.out.println(livro.getValue());
        }

        System.out.println("\nLivros do autor 1:");
        for (Map.Entry<String, Livro> livro : livraria.pesquisarLivrosPorAutor("Autor 1").entrySet()) {
            System.out.println(livro.getValue());
        }

        System.out.println("\nLivro mais caro:");
        for (Map.Entry<String, Livro> livro : livraria.obterLivroMaisCaro().entrySet()) {
            System.out.println(livro.getValue());
        }

        System.out.println("\nLivro mais barato:");
        for (Map.Entry<String, Livro> livro : livraria.exibirLivroMaisBarato().entrySet()) {
            System.out.println(livro.getValue());
        }
    }
}
