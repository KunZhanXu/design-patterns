package com.xkz.factory.simplefactory.pizzastore.order;

public class PizzaStore {

    public static void main(String[] args) {
        //new OrderPizza();
        // 使用简单工厂模式
        new OrderPizza(new SimpleFactory());
    }
}
