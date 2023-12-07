package com.xkz.singleton.type2;

// 饿汉式（静态代码块）
public class Singleton {
    private Singleton(){

    }

    private static Singleton instance;

    static {
        //在静态代码块中，创建单例对象
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
