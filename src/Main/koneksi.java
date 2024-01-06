/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author LENOVO
 */
public class koneksi {

    static Connection getConnection() {
        Connection connection = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_pbo2";
        String user = "root";
        String password = "";
        if (connection == null) {
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_pbo2","root","");
            } catch (ClassNotFoundException | SQLException error) {
               System.exit(0);
            }

        }
        return connection;
    }
}
