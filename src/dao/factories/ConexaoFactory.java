package dao.factories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    private static final String URL = "jdbc:mariadb://127.0.0.1:3306/ibank";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection getConexao() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
