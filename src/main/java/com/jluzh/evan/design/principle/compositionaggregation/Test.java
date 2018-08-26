package com.jluzh.evan.design.principle.compositionaggregation;

public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new SQLServerConnection());
        System.out.println(productDao.addProduct());
    }
}
