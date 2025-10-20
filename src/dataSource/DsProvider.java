package dataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;

public class DsProvider {

    private static final HikariDataSource ds;

    private final static String url = "jdbc:mysql://localhost:3306/ada2punto3";
    private final static String user = "root";
    private final static String pass = "admin";

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(url);
        config.setUsername(user);
        config.setPassword(pass);

        config.setMaximumPoolSize(5);
        config.setConnectionTimeout(10000);
        config.setMaxLifetime(200000);
        config.setMinimumIdle(2);

        ds = new HikariDataSource(config);
    }

    public static DataSource get(){
        return ds;
    }


}
