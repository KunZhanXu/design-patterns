package com.xkz.singleton.type6;

import com.xkz.singleton.type6.Singleton;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashcode = "+instance1.hashCode());
        System.out.println("instance2.hashcode = "+instance2.hashCode());
    }
}
