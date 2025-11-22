package DCIS;
import java.sql.*;
import javax.swing.*;
import javax.swing.JFrame;
public class ConnectionDB extends JFrame{
       
        
 public static java.sql.Connection ConnectDb(){
    
    try{
       java.sql.Connection con =DriverManager.getConnection("jdbc:mysql://localhost/dcis","root","");
    //  JOptionPane.showMessageDialog(null, "Connection Established from method call");
    return con;
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Connection failed.\n"+e,"ERROR",JOptionPane.ERROR_MESSAGE);
       return null;
       
       }
    
 }
 
}
