
package javafxswingapplication1;
import java.sql.*;
public class Db {
    public static void main(String [] args){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://host:3306/binoddatabase?user=root&password=root&useUnicode=true&characterEncoding=UTF-8");
           Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery("select * from binodtable");
           while(rs.next()){
                System.out.println(
                        rs.getString(1)+
                        " "+rs.getString(2)
                        
                );
            }
            con.close();
        }
        catch(Exception e){
            System.out.println("Sorry some unexpected error");
            System.out.println(e.getMessage());
        }
    }    
}

