package com.jluzh.evan.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");

        // 序列化反序列化导致单例破坏
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = null;
//        ObjectInputStream ois = null;
//        try {
//            oos = new ObjectOutputStream(new FileOutputStream("single_file"));
//            oos.writeObject(instance);
//            ois = new ObjectInputStream(new FileInputStream("single_file"));
//
//            HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//
//            System.out.println(instance);
//            System.out.println(newInstance);
//            System.out.println(instance == newInstance);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            ois.close();
//            oos.close();
//        }
        // 反射调用
//        Class objectClass = HungrySingleton.class;
//        Class objectClass = LazySingleton.class;
//
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

        // 枚举类 单例
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//        ObjectOutputStream oos = null;
//        ObjectInputStream ois = null;
//        try {
//            oos = new ObjectOutputStream(new FileOutputStream("single_file"));
//            oos.writeObject(instance);
//            ois = new ObjectInputStream(new FileInputStream("single_file"));
//
//            EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//            System.out.println(instance.getData());
//            System.out.println(newInstance.getData());
//            System.out.println(instance.getData() == newInstance.getData());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            ois.close();
//            oos.close();
//        }
//
//        EnumInstance instance1  = EnumInstance.getInstance();
//        instance1.printTest();
    }
}
