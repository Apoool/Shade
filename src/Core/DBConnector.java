package Core;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnector {

    public  Connection dbLink;

    public Connection getConnection(){
        String dbName = "db1";
        String dbUser = "root";
        String dbPass = "mypass";
        String url = "jdbc:mysql://localhost/" + dbName;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            dbLink = DriverManager.getConnection(url, dbUser, dbPass);
        }catch (Exception e){
            e.printStackTrace();
        }
        return dbLink;
    }
}
