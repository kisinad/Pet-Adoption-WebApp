package edu.miu.cs.cs427.blackpanther.service;

import edu.miu.cs.cs427.blackpanther.model.PetDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PetRegistrationService {

    public int registerPet(PetDTO petDTO) {
        System.out.println("Starting the registration of Pet....");
        String INSERT_USERS_SQL = "INSERT INTO PetWebAppUsers.pets (idpet, type, breed, sex,color,weight, description, date) VALUES (?,?,?,?,?,?,?,?);";

        int result = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex){
            System.out.println("Unable to load the class. Terminating the program");
            System.exit(-1);
        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://petadoptionwebapp.cj8knql7p2wt.us-east-2.rds.amazonaws.com:3306/PetWebAppUsers", "AWSRDS", "Password123");

            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
                System.out.println("Connected to the Database ....");
                preparedStatement.setInt(1, petDTO.getPetID());
                preparedStatement.setString(2, petDTO.getType());
                preparedStatement.setString(3, petDTO.getBreed());
                preparedStatement.setString(4, petDTO.getSex());
                preparedStatement.setString(5, petDTO.getColor());
                preparedStatement.setString(6, petDTO.getWeight());
                preparedStatement.setString(7, petDTO.getDescription());
                preparedStatement.setString(8, petDTO.getImage());
                preparedStatement.setString(9, petDTO.getDate());

                System.out.println(preparedStatement);
                result = preparedStatement.executeUpdate();
            } catch (SQLException e) {
                    e.printStackTrace();
            }
            return  result;

        }


    }




