package com.xkz.singleton.type6;

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
                if(instance == null)
                {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
