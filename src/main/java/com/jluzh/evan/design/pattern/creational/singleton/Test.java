package com.jluzh.evan.design.pattern.creational.singleton;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("program end");

        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("single_file"));
            oos.writeObject(instance);
            ois = new ObjectInputStream(new FileInputStream("single_file"));

            HungrySingleton newInstance = (HungrySingleton) ois.readObject();

            System.out.println(instance);
            System.out.println(newInstance);
            System.out.println(instance == newInstance);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            ois.close();
            oos.close();
        }
    }
}
