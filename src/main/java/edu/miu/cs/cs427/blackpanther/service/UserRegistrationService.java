package edu.miu.cs.cs427.blackpanther.service;

import edu.miu.cs.cs427.blackpanther.model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRegistrationService {

    public int registerUser(User user) throws ClassNotFoundException, SQLException {
        String INSERT_USERS_SQL = "INSERT INTO `PetWebApp`.`users` + " +
                " ( firstName, lastName, userName, password, age, email) VALUES" +
                " (?,?,?,?,?,?);";
//        String INSERT_USERS_SQL = "INSERT INTO `PetWebApp`.`users` ( id, firstName, lastName, userName, password, age, email)" +
//        "VALUES ("+2+","+user.getFirstName() +","+user.getLastName()+","+user.getUserName() +","+user.getPassword()+","+user.getAge()+","+user.getEmail()+");";
        System.out.println(user.getUserName());
//        SELECT id, firstName, lastName, userName, password, age, email
//        FROM `PetWebApp`.`users`;
        int result = 0;
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PetWebApp?useSSL=false", "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
            preparedStatement.setInt(1,1);
            preparedStatement.setString(2, user.getFirstName());
            preparedStatement.setString(3, user.getLastName());
            preparedStatement.setString(4, user.getUserName());
            preparedStatement.setString(5, user.getEmail());
            preparedStatement.setString(6, user.getPassword());
            preparedStatement.setInt(7, user.getAge());
            System.out.println(preparedStatement);
            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }


}
