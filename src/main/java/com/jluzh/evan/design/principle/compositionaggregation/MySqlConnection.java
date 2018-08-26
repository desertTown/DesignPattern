package com.jluzh.evan.design.principle.compositionaggregation;

public class MySqlConnection extends DBConnection{

    @Override
    public String getConnection() {
        return "this is MysqlConnection";
    }
}
