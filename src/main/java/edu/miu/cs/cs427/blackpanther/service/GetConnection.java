package edu.miu.cs.cs427.blackpanther.service;
import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
    // create a function to connect with mysql database
    public static Connection getConnection(){

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://petadoptionwebapp.cj8knql7p2wt.us-east-2.rds.amazonaws.com:3306/PetWebAppUsers", "AWSRDS", "Password123");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/PetWebApp", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }
}
//    Connection connection = DriverManager.getConnection("jdbc:mysql://petadoptionwebapp.cj8knql7p2wt.us-east-2.rds.amazonaws.com:3306/PetWebAppUsers", "AWSRDS", "Password123");
////        try(Connection connection = DriverManager.getConnection("jdbc:mysql:///PetWebApp?useSSL=false", "root", "");