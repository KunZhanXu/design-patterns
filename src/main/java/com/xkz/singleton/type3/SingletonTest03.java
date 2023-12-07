package com.xkz.singleton.type3;

import com.xkz.singleton.type3.Singleton;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashcode = "+instance1.hashCode());
        System.out.println("instance2.hashcode = "+instance2.hashCode());
    }
}
