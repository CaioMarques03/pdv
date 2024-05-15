package main.java.model;

public class ItemVenda {

    private int numeroItem;
    private Produto produto;
    private int quantidade;
    private float precoUnitario;
    private float totalItem;


    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public float getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(float totalItem) {
        this.totalItem = totalItem;
    }

}
