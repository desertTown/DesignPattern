package com.jluzh.evan.design.principle.compositionaggregation;

public class ProductDao {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public String addProduct() {
        return dbConnection.getConnection();
    }
}
