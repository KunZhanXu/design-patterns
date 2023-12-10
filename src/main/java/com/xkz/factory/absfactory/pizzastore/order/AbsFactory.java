package com.xkz.factory.absfactory.pizzastore.order;

import com.xkz.factory.absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
