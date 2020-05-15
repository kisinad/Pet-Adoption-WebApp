package edu.miu.cs.cs427.blackpanther.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
    // create a function to connect with mysql database
    public static Connection getConnection(){
        String url = "jdbc:mysql://petadoptionwebapp.cj8knql7p2wt.us-east-2.rds.amazonaws.com:3306/PetWebAppUsers";
        String user = "AWSRDS";
        String password = "Password123";
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }
}
