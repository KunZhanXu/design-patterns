package com.xkz.prototype.deepclone;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
//        DeepProtoType p = new DeepProtoType();
//        p.name = "小明";
//        p.deepCloneableTarget = new DeepCloneableTarget("1","2");
//
//        //深拷贝
//        DeepProtoType p2 = (DeepProtoType)p.clone();
//        System.out.println("p.name="+p.name+"p.target="+p.deepCloneableTarget.hashCode());
//        System.out.println("p2.name="+p2.name+"p2.target="+p2.deepCloneableTarget.hashCode());

        DeepProtoType p = new DeepProtoType();
        p.name = "小明";
        p.deepCloneableTarget = new DeepCloneableTarget("1","2");

        //深拷贝
        DeepProtoType p2 = (DeepProtoType)p.deepClone();
        System.out.println("p.name="+p.name+"p.target="+p.deepCloneableTarget.hashCode());
        System.out.println("p2.name="+p2.name+"p2.target="+p2.deepCloneableTarget.hashCode());
    }
}
