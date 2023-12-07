package com.xkz.singleton.type5;

/**
 * 懒汉式，线程安全
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance() {
        if(instance == null)
        {
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
