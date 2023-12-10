package com.xkz.factory.simplefactory.pizzastore.pizza;

public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制造胡椒披萨 准备原材料");
    }
}
