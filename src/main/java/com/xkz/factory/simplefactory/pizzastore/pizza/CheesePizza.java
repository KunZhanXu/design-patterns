package com.xkz.factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制造奶酪披萨 准备原材料");
    }
}
