package Assigiment2.baithijp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MssqlConnection {
    public static Connection getMssqlConnection() throws SQLException{
        String dbURL = "jdbc:mysql://localhost:3306/dbb2";
        String userName = "root";
        String password = "";
        Connection conn = DriverManager.getConnection(dbURL,userName,password);

        return  conn;
    }

    public static void main(String[] args) throws SQLException {
        if (getMssqlConnection() != null){
            System.out.println("ket noi thanh cong");
        }

    }
}