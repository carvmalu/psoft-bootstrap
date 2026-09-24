package br.edu.ufcg.psoft.mercado;

public class ItemVenda {

    private Produto produto;
    private int quantidade;

    ItemVenda(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubTotal() {
        double subtotal = produto.getPreco() * quantidade;
        if (quantidade >= 20) {
            subtotal = subtotal - subtotal * 0.10;
        }
        return subtotal;
    }
}