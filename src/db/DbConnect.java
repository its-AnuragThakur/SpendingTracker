
package db;
import java.sql.*;
import javax.swing.JOptionPane;


public class DbConnect {
    public static Connection c;
    public static Statement st;
    static{
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdata"+"?useSSL=false","root","Prachi@12345"); 
        st= c.createStatement();
        } catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
      }
    }
}