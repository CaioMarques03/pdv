package main.java.model;

import java.util.Date;

public class Produto {

    private int codigo;
    private String nome;
    private String unidade;
    private float preco;
    private int quantidadeEstoque;
    private Date ultimaVenda;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Date getUltimaVenda() {
        return ultimaVenda;
    }

    public void setUltimaVenda(Date ultimaVenda) {
        this.ultimaVenda = ultimaVenda;
    }

}
