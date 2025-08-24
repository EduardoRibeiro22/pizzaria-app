package com.pizzariachief.pedidos.model;

public abstract class IngredienteDecorator implements Pizza {

    protected Pizza pizza;

    public IngredienteDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }

    @Override
    public double getPreco() {
        return pizza.getPreco();
    }
}
