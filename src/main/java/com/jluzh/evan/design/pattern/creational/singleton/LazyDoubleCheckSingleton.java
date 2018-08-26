package com.jluzh.evan.design.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton(); // 这一句会执行以下3步骤
                    //1. 分配内存给这个对象
                    //2. 初始化对象
                    //3. 设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    //  2,3 步骤可能会进行重排序， 也就是说设置lazyDoubleCheckSingleton指向的内存地址，这时候对象并不为null， 但没有初始化
                }
            }

        }
        return lazyDoubleCheckSingleton;
    }
}
