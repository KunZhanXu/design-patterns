package com.xkz.prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());

        System.out.println(sheep.hashCode());
        System.out.println(sheep2.hashCode());
        System.out.println(sheep3.hashCode());
        System.out.println(sheep4.hashCode());
        System.out.println(sheep5.hashCode());

    }
}
