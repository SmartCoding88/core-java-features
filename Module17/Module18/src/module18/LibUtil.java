/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package module18;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author testuser
 */
public class LibUtil {
    public static Connection getConn() {
        Connection conn;
        try {
            Properties prop = new Properties();
            FileInputStream in= new FileInputStream("src/module18/DBProperties");
            prop.load(in);
            String driver= prop.getProperty("DBDriver");
            //1.Register and load driver
            Class.forName(driver);
            
            String databaseName,userName,password;
            databaseName= prop.getProperty("DBName");
            userName= prop.getProperty("User");
            password= prop.getProperty("Password");
            
            //2. Get the connection
            conn = DriverManager.getConnection(databaseName,userName,password);
            return conn;
            } catch (Exception e) {
            e.printStackTrace();
        } 
        return null;

    }

}
