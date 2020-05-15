package edu.miu.cs.cs427.blackpanther.repository;

import edu.miu.cs.cs427.blackpanther.model.UserDTO;
import edu.miu.cs.cs427.blackpanther.util.GetConnection;

import java.sql.*;

public class LoginDAO {//DAO

    public String authenticate(UserDTO userDTO){
        String userName = userDTO.getUserName();
        String password = userDTO.getPassword();

        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String userNameDB = "";
        String passwordDB =  "";
        String firstName = "";
        String QUERY_DB_FOR_USER_SIGNIN = "select userName, password, firstName from PetWebAppUsers.users ";

        try {
            con = GetConnection.getConnection(); //Fetch database connection object
            statement = con.createStatement();//Statement is used to write queries.
            resultSet = statement.executeQuery(QUERY_DB_FOR_USER_SIGNIN);

            while (resultSet.next())//Until next row is present otherwise it return false
            {
                userName = resultSet.getString("userName");
                passwordDB = resultSet.getString("password");
                firstName = resultSet.getString("firstName");

                UserDTO holderUserDB = new UserDTO();
                holderUserDB.setUserName(userName);
                holderUserDB.setPassword(passwordDB);

                if(userDTO.equals(holderUserDB) == true){
                    System.out.println("Successfully authenticated!!");
                    return "SUCCESS AUTHENTICATION";

                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Invalid user credentials";
    }
}