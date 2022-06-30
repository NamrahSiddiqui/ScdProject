
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class DBHandler {
      Connection conn;
    public DBHandler()
    {
        try {
            //to make connection with Database instantly after class is created.
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
            System.out.println("Connection established!!");
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void addData(String query)
    {
        try {
            //this query will be created in controller.
            Statement st=conn.createStatement();
            //this will return integer value which will tell us about the number of rows changed in database.
            int r=st.executeUpdate(query);
            if(r!=0)
            {
                JOptionPane.showMessageDialog(null, "Record Inserted");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet showData(String query)
    {
          ResultSet rs=null;
        try {
            Statement st = conn.createStatement();
         rs=st.executeQuery(query);
         if(rs==null)
                System.out.println("empty");
          else
                System.out.println("abc");
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rs;
    }
    
    
}
