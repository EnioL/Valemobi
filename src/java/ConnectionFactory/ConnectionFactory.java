package ConnectionFactory;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class ConnectionFactory {

    private static ConnectionFactory datasource;
    private BasicDataSource ds;

    private ConnectionFactory() throws IOException, SQLException, PropertyVetoException {
        ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("root");
        ds.setUrl("jdbc:mysql://127.0.0.1:3306/batch");
       
        // the settings below are optional -- dbcp can work with defaults
        ds.setMinIdle(5);
        ds.setMaxIdle(20);
        ds.setMaxOpenPreparedStatements(180);
    }

    public static ConnectionFactory getInstance() throws IOException, SQLException, PropertyVetoException {
        if (datasource == null) {
            datasource = new ConnectionFactory();
            return datasource;
        } else {
            return datasource;
        }
    }

    public Connection getConnection() throws SQLException {
        return this.ds.getConnection();
    }
}