package com.pizzariachief.pedidos.model.decorators;

import com.pizzariachief.pedidos.model.IngredienteDecorator;
import com.pizzariachief.pedidos.model.Pizza;

public class Ovo extends IngredienteDecorator {

    public static final double VALOR_OVO_ADICIONAL = 4.0;

    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com Ovo";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + VALOR_OVO_ADICIONAL;
    }
}
