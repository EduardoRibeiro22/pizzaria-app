package com.pizzariachief.pedidos.model;

public class PizzaBase implements Pizza {

    private TipoDeMassa tipoDeMassa;
    private double preco;

    public PizzaBase(TipoDeMassa tipoDeMassa, double preco) {
        this.tipoDeMassa = tipoDeMassa;
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        String descricao = getTipoDeMassa().toString();
        return String.format("Tipo de Massa: %s", descricao);
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    public TipoDeMassa getTipoDeMassa() {
        return tipoDeMassa;
    }

}
