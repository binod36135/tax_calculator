package javafxswingapplication1;
import java.sql.*;
public class Db1 {
    public static void main(String[] args){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/binoddatabase","root","root");
            System.out.println("connection established");
        }
        catch(ClassNotFoundException e){
            System.out.println("Exception"+e.getMessage());
        }
        catch(SQLException e){
            System.out.println("SQL Exception: "+e.getMessage());
        }
    }
    
}
