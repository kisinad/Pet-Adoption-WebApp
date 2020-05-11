package edu.miu.cs.cs427.blackpanther.service;
import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
    // create a function to connect with mysql database
    public static Connection getConnection(){

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/PetWebApp.users", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }
}
