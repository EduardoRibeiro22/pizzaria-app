package com.pizzariachief.pedidos.application;

import com.pizzariachief.pedidos.model.Pizza;
import com.pizzariachief.pedidos.model.PizzaBase;
import com.pizzariachief.pedidos.model.TipoDeMassa;
import com.pizzariachief.pedidos.model.decorators.Bacon;
import com.pizzariachief.pedidos.model.decorators.Ovo;
import com.pizzariachief.pedidos.model.decorators.Queijo;

public class Main {
    public static void main(String[] args) {
        Pizza pizzaSimples = new PizzaBase(TipoDeMassa.MASSA_GROSSA,25.56);
        System.out.println(pizzaSimples.getDescricao() + ", Valor: " + pizzaSimples.getPreco());
        Pizza pizzaComQueijo = new Queijo(pizzaSimples);
        System.out.println(pizzaComQueijo.getDescricao() + ", Valor: " + pizzaComQueijo.getPreco());
        Pizza pizzaCompleta = new Ovo(new Bacon(new Queijo(pizzaSimples)));
        System.out.println(pizzaCompleta.getDescricao() + ", Valor: " + pizzaCompleta.getPreco());


    }
}
