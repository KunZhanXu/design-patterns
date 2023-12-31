package com.xkz.factory.factorymethod.pizzastore.order;

import com.xkz.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    // 定义抽象方法，让工厂子类实现，相当是把工厂抽象化了
    abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        Pizza pizza = null;
        String orderType;  //订购披萨的类型
        do{
            orderType = getType();
            pizza = createPizza(orderType);

            // 输出pizza
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cute();
                pizza.box();
            }else {
                System.out.println("订购披萨失败");
                break;
            }
        }while (true);
    }


    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType(){
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类：");
            String str = strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }

}
