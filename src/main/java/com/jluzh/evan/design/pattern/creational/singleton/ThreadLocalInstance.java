package com.jluzh.evan.design.pattern.creational.singleton;

public class ThreadLocalInstance {
//    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal
//            = new ThreadLocal<ThreadLocalInstance>(){
//        @Override
//        protected ThreadLocalInstance initialValue() {
//            return new ThreadLocalInstance();
//        }
//    };

    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal = ThreadLocal.withInitial(ThreadLocalInstance::new);

    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstanceThreadLocal.get();
    }
}
