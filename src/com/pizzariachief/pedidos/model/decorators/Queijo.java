package com.pizzariachief.pedidos.model.decorators;

import com.pizzariachief.pedidos.model.IngredienteDecorator;
import com.pizzariachief.pedidos.model.Pizza;

public class Queijo extends IngredienteDecorator {
    public static final double VALOR_QUEIJO_EXTRA = 3.0;

    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Com Queijo Extra";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + VALOR_QUEIJO_EXTRA;
    }
}
