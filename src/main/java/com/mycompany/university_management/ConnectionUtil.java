/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gr
 */
public class ConnectionUtil {
    
    public static Connection getInstance() throws ClassNotFoundException, SQLException
    {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/university_db","root","");
        if(conn==null)
            {
                System.err.println("Connection error");
            }
            else{
                System.out.println("Connection established");
            }
        return conn;
    }
    
}
