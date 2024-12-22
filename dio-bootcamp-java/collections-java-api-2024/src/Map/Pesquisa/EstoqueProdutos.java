package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valortotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valortotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valortotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

//    public Produto obterProdutoMaisBarato(){
//
//    }

    public static void main(String[] args) {
        EstoqueProdutos produtos = new EstoqueProdutos();

        produtos.exibirProdutos();
        produtos.adicionarProduto(1L, "Josefina", 1, 12.25);
        produtos.adicionarProduto(2L, "Josegrossa", 1, 12.45);
        produtos.adicionarProduto(3L, "Margarina", 1, 25.50);
        produtos.adicionarProduto(4L, "Manteiga", 1, 14.75);
        produtos.exibirProdutos();
        System.out.println(produtos.calcularValorTotalEstoque());
        System.out.println(produtos.obterProdutoMaisCaro());
    }
}
