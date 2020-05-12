package edu.miu.cs.cs427.blackpanther.service;

import edu.miu.cs.cs427.blackpanther.model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRegistrationService {

    public int registerUser(User user)  {
        System.out.println("Reached DB!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        String INSERT_USERS_SQL = INSERT INTO PetWebApp.users  (firstName, lastName, userName, password, email) VALUES ('Denis','Kisina','dfafdsfsdfd','kisinad@gmail.com','Password123');
        String INSERT_USERS_SQL = "INSERT INTO PetWebApp.users (firstName, lastName, userName, password, email) VALUES (?,?,?,?,?);";
//        String INSERT_USERS_SQL = "INSERT INTO `PetWebApp`.`users` ( id, firstName, lastName, userName, password, age, email)" +
//        "VALUES ("+2+","+user.getFirstName() +","+user.getLastName()+","+user.getUserName() +","+user.getPassword()+","+user.getAge()+","+user.getEmail()+");";
        System.out.println("user.getUserName()");
//        SELECT id, firstName, lastName, userName, password, age, email
//        FROM `PetWebApp`.`users`;
        int result = 0;
        //Load the driver class
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Unable to load the class. Terminating the program");
            System.exit(-1);
        }

        try(Connection connection = DriverManager.getConnection("jdbc:mysql:///PetWebApp?useSSL=false", "root", "");

            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){

            System.out.println("Connected to the Database ....");
            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3, user.getUserName());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getPassword());
            System.out.println(preparedStatement);
            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }


}
