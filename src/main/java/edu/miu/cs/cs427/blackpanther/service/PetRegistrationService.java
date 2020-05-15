package edu.miu.cs.cs427.blackpanther.service;

import edu.miu.cs.cs427.blackpanther.model.PetDTO;
import edu.miu.cs.cs427.blackpanther.util.GetConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PetRegistrationService {

    public int registerPet(PetDTO petDTO) {
        System.out.println("Starting the registration of Pet....");
        String INSERT_PET_INTO_DB_SQL = "INSERT INTO PetWebAppUsers.pets ( type, breed, sex, color, weight, description, datePosted) VALUES ( ?, ?, ?, ?, ?,?,?);";

        int result = 0;

        try {
            Connection connection = GetConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PET_INTO_DB_SQL);
            System.out.println("Started to writing to DB ....");
            preparedStatement.setString(1, petDTO.getType());
            preparedStatement.setString(2, petDTO.getBreed());
            preparedStatement.setString(3, petDTO.getSex());
            preparedStatement.setString(4, petDTO.getColor());
            preparedStatement.setString(5, petDTO.getWeight());
            preparedStatement.setString(6, petDTO.getDescription());
            preparedStatement.setString(7, petDTO.getDate());

            System.out.println("Success.....");
                System.out.println(preparedStatement);
                result = preparedStatement.executeUpdate();
            } catch (SQLException e) {
                    e.printStackTrace();
            }
            return  result;

        }


    }




