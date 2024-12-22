package List.CarrinhoDeCompras;

public class Item {
    private String item;
    private double preco;
    private int quantidade;

    public Item(String item, double preco, int quantidade) {
        this.item = item;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getItem(){
        return item;
    }

    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString() {
        return "Lista de Compras: " +
                "Item = '" + item + '\'' +
                ", preço = " + preco +
                ", quantidade = " + quantidade ;

    }
}
