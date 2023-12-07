package com.xkz.singleton.type1;

/**
 * 饿汉式（静态变量）
 */
public class Singleton {
    // 构造器私有化，外部不可以new
    private Singleton() {

    }

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}
