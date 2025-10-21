package dao;

import dataSource.DsProvider;

import javax.sql.DataSource;
import java.sql.Connection;

public class EmpleadosDao {
    private final DataSource ds;
    public EmpleadosDao(){
        this.ds = DsProvider.get();
    }



}
