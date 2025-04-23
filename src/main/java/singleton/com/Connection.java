package singleton.com;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.hibernate.HikariConnectionProvider;

import java.sql.SQLException;

public class Connection {
    private HikariDataSource ds = null;
    private HikariConfig config = new HikariConfig();
    {
        config.setJdbcUrl("jdbc:sqlite:db.db");
        config.setUsername("sa");
        config.setPassword("");
        config.setConnectionTimeout(3000);
        ds = new HikariDataSource(config);
    }
    public Connection getConnection() {
        try {
            System.out.println("Conexión exitada...");
            return (Connection) ds.getConnection();

        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static HikariConnectionProvider get()
    {
        return null;
    }
}