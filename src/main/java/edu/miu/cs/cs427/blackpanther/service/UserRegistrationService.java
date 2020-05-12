package edu.miu.cs.cs427.blackpanther.service;

import edu.miu.cs.cs427.blackpanther.model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRegistrationService {

    public int registerUser(User user)  {
        System.out.println("Reached DB!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

//        String INSERT_USERS_SQL = "INSERT INTO PetWebApp.users (firstName, lastName, userName, password, email) VALUES (?,?,?,?,?);";
        String INSERT_USERS_SQL = "INSERT INTO PetWebAppUsers.users (firstName, lastName, userName, password, email) VALUES (?,?,?,?,?);";
        System.out.println("user.getUserName()");
        int result = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Unable to load the class. Terminating the program");
            System.exit(-1);
        }

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://petadoptionwebapp.cj8knql7p2wt.us-east-2.rds.amazonaws.com:3306/PetWebAppUsers", "AWSRDS", "Password123");
//        try(Connection connection = DriverManager.getConnection("jdbc:mysql:///PetWebApp?useSSL=false", "root", "");

            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){

            System.out.println("Connected to the Database ....");
            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3, user.getUserName());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getEmail());
            System.out.println(preparedStatement);
            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }


}
