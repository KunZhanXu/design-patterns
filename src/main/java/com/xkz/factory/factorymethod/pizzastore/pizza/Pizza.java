package com.xkz.factory.factorymethod.pizzastore.pizza;

public abstract class Pizza {

    protected String name; //名字

    // 准备原材料不一样，做成抽象方法
    public abstract void prepare();

    public void bake(){
        System.out.println(name+"baking;");
    }

    public void cute(){
        System.out.println(name+"cute;");
    }

    public void box(){
        System.out.println(name+"box;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
