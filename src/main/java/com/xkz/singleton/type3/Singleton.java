package com.xkz.singleton.type3;

public class Singleton {
    private static Singleton instance;

    private Singleton(){

    }

    /**
     * 提供一个静态的公用方法，只有用到的时候，才去创建
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
