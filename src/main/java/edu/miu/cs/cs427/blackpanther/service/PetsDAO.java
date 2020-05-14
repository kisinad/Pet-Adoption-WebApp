package edu.miu.cs.cs427.blackpanther.service;

import edu.miu.cs.cs427.blackpanther.model.PetDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PetsDAO {//DAO

    public List<PetDTO> getAllPets(){


        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<PetDTO> petsList = new ArrayList<>();

        try {
            con = GetConnection.getConnection(); //Fetch database connection object
            statement = con.createStatement();//Statement is used to write queries.
            resultSet = statement.executeQuery("select idpet, type, breed, sex, color, weight, description, datePosted from PetWebAppUsers.pets ");


            while (resultSet.next())//Until next row is present otherwise it return false
            {
                Integer idpet = resultSet.getInt("idpet");
                String type = resultSet.getString("type");
                String breed = resultSet.getString("breed");
                String sex = resultSet.getString("sex");
                String color = resultSet.getString("color");
                String weight = resultSet.getString("weight");
                String description = resultSet.getString("description");
                String datePosted = resultSet.getString("datePosted");
                PetDTO petDTO = new PetDTO(idpet, type, breed, sex, color, weight, description, datePosted);
                petsList.add(petDTO);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return petsList;
    }
}