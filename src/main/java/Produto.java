package br.edu.ufcg.psoft.mercado;

public class Produto {

    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double novoValor) {
        this.valor = novoValor;
    }
}