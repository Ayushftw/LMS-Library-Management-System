package librarymanagementsystem;

import java.sql.*;
class Connect
{
    Connection con;
   
    Connection connectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e){}
        
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root","namanverma2002");
        }
        catch(SQLException e)
        {
           
        }
        System.out.print("connection found  :  "+con);
        return (con);
    }
    public static void main(String args[])
    {
        Connect c1=new Connect();
        c1.connectDB();
    }
   
}

