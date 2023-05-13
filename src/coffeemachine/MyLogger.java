/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine;

import java.sql.*;

/**
 *
 * @author yasse
 */
public class MyLogger implements Logger {
        
    

    public Connection getconnection ()throws Exception
    { 
        Connection con=null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_machine", "root", "");
        }catch  (Exception e) {
            throw e;
        }
        return con;
    }
    @Override
    public void log(String message) {
      try {
            
         Connection con= getconnection();
//here sonoo is database name, root is username and password  
            
             String sql =" insert into orders (details) values (?)";
          
             PreparedStatement preparedStmt =   con.prepareStatement(sql);
             preparedStmt.setString(1, message);
             preparedStmt.execute();
            con.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void log(double water , double arabica , double robusta , int tray) {
      try {
            
           Connection con= getconnection();
//here sonoo is database name, root is username and password  
            
             String sql =" UPDATE tank SET water_level=?, arabica_level=? , robusta_level=? , tray=?";
          
             PreparedStatement preparedStmt = con.prepareStatement(sql);
             preparedStmt.setDouble(1,water);
             preparedStmt.setDouble(2,arabica);
             preparedStmt.setDouble(3,robusta);
             preparedStmt.setInt(4,tray);
             preparedStmt.execute();
            con.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
