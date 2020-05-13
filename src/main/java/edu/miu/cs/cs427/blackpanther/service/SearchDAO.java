package edu.miu.cs.cs427.blackpanther.service;

import edu.miu.cs.cs427.blackpanther.model.PetDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchDAO {
    public String doSearch(PetDTO petDTO){
        //Assign pet entered values to temporary variables.
        String typeTemp = petDTO.getType();
        String breedTemp = petDTO.getBreed();


        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String output = "";


        String petTypeDB = "";
        String petBreedDB = "";
        String petSexDB = "";
        String petRegistrationDateDB = "";

        try {
            con = GetConnection.getConnection(); //Fetch database connection object
            statement = con.createStatement();//Statement is used to write queries.

            //the table name is pets, breed, sex, date. Fetching all the records and storing in a
            // resultSet.
            resultSet = statement.executeQuery("select type, sex  from pets");

            while (resultSet.next())//Until next row is present otherwise it return false
            {
                //fetch the values present in database
                petTypeDB = resultSet.getString("type");
                petBreedDB = resultSet.getString("breed");
                petSexDB = resultSet.getString("sex");
                petRegistrationDateDB = resultSet.getString("date");

                output = petTypeDB + ": " + petBreedDB + ": " + petSexDB+ ": " + petRegistrationDateDB;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return output;
    }
}
