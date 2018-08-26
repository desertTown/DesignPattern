package com.jluzh.evan.design.principle.compositionaggregation;

public class SQLServerConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "this is SQLServerConnection";
    }
}
