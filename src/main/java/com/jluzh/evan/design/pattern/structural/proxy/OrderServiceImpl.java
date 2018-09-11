package com.jluzh.evan.design.pattern.structural.proxy;


public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;


    @Override
    public int saveOrder(Order order) {
        //Spring会自己注入，我们课程中就直接new了
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }

}
