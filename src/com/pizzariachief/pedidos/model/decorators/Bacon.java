package com.pizzariachief.pedidos.model.decorators;

import com.pizzariachief.pedidos.model.IngredienteDecorator;
import com.pizzariachief.pedidos.model.Pizza;

public class Bacon extends IngredienteDecorator {

    public static final double VALOR_BACON_ADICIONAL = 7.0;

    public Bacon(Pizza pizza) {
        super(pizza);
    }
    @Override
    public double getPreco() {
        return super.getPreco() + VALOR_BACON_ADICIONAL;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com Bacon";
    }
}
