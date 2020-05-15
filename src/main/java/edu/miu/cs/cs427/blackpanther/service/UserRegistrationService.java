package edu.miu.cs.cs427.blackpanther.service;

import edu.miu.cs.cs427.blackpanther.model.UserDTO;
import edu.miu.cs.cs427.blackpanther.util.GetConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRegistrationService {

    public int registerUser(UserDTO userDTO)  {

        String INSERT_USER_INTO_DB_SQL = "INSERT INTO PetWebAppUsers.users (firstName, lastName, userName, password, email) VALUES (?,?,?,?,?);";

        int result = 0;

        try{
            Connection connection = GetConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_INTO_DB_SQL);
            System.out.println("Connected to the Database ....");
            preparedStatement.setString(1, userDTO.getFirstName());
            preparedStatement.setString(2, userDTO.getLastName());
            preparedStatement.setString(3, userDTO.getUserName());
            preparedStatement.setString(4, userDTO.getPassword());
            preparedStatement.setString(5, userDTO.getEmail());
            System.out.println(preparedStatement);
            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }


}
