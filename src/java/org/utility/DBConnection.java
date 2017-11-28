/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.utility;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author YASH
 */
public class DBConnection {
    
    public static Connection getConnection() throws Exception{
        String d = "com.mysql.jdbc.Driver";
        String url= "jdbc:mysql://localhost:3306/grossarydb";
        String un = "root";
        String pwd = "admin";
        Class.forName(d);
        Connection con = DriverManager.getConnection(url, un, pwd);
        
        return con;
    }
    
}
