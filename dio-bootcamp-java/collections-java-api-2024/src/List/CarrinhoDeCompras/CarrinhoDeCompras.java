package List.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }
    public String adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
        return "item adicionado: " + nome + ", Preço: " + preco +
                ", Quantidade: " + quantidade;

    }
    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for(Item it: itemList){
            if (it.getItem().equalsIgnoreCase(nome) ){
                itemsParaRemover.add(it);
            }
        }
        itemList.removeAll(itemsParaRemover);

    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : itemList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras list = new CarrinhoDeCompras();

        System.out.println(     list.adicionarItem("Macarrão", 50.0, 2));
        list.removerItem("Macarrão" );

        list.exibirItens();
        list.adicionarItem("Macarrão", 50.0, 2);
        list.adicionarItem("Arroz", 20.0, 1);
        list.exibirItens();
        System.out.println("Valor total do carrinho: " + list.calcularValorTotal());

    }

}
