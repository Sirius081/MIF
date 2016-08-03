package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by sirius on 16-8-1.
 */
public class DBtool {
    static  Connection con;
    static {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String username="root";
            String password="1234";
            String url="jdbc:mysql://58.198.176.211:3306/ylbx";
            con=(Connection) DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return con;
    }

    public static void main(String[] args)throws  Exception {
        Connection con=getConnection();
        PreparedStatement stmt=con.prepareStatement("insert into variables value(4,'的冯绍峰')");
        stmt.execute();
    }
}
