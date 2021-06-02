
package connect;

import dao.PersonalDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBConnect {
    //kết nối đến MYSQL
    public static Connection getConnectionMYSQL()
    {
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll", "root", "admin");
            
            
        } catch (Exception e) 
        {
            System.out.println("Loi" + e.getMessage() );
        }
        return conn;
    }
    //kết nối đến MS SQL Server
    public static Connection getConnectionSQLServer()
    {
        Connection conn = null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://2DFPCVKWUZTOSY4\\SQLEXPRESS:49794;databaseName=payroll","username","password");
        } catch (Exception e) 
        {
            System.out.println("Loi " + e.getMessage() );
        }
        return conn;
    }
            
    public static void main(String[] args) throws SQLException
    {
        System.out.println(DBConnect.getConnectionMYSQL() );
    }
}
