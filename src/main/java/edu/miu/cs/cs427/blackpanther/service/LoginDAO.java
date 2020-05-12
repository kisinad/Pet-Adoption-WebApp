package edu.miu.cs.cs427.blackpanther.service;

import edu.miu.cs.cs427.blackpanther.model.LoginBeanDTO;

import java.sql.*;

public class LoginDAO {//DAO

    public String authenticate(LoginBeanDTO loginBeanDTO){
        String userName = loginBeanDTO.getUserName();
        String password = loginBeanDTO.getPassword();

        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String userNameDB = "";
        String passwordDB =  "";

        try {
            con = GetConnection.getConnection(); //Fetch database connection object
            statement = con.createStatement();//Statement is used to write queries.
            resultSet = statement.executeQuery("select userName, password from PetWebAppUsers.users ");
//            resultSet = statement.executeQuery("select userName, password from PetWebApp.users");//the table name is users and userName,password are columns. Fetching all the records and storing in a resultSet.

            while (resultSet.next())//Until next row is present otherwise it return false
            {
                userName = resultSet.getString("userName");
                passwordDB = resultSet.getString("password");
                LoginBeanDTO holderUserDB = new LoginBeanDTO();
                holderUserDB.setUserName(userName);
                holderUserDB.setPassword(passwordDB);


                System.out.println("Name & Password in DB " + userName +": " + passwordDB);

                if(loginBeanDTO.equals(holderUserDB) == true){
                    System.out.println("Successfully authenticated!!");
                    return "SUCCESS AUTHENTICATION";

                }
//                if (userName.equals(userNameDB)&&password.equals(passwordDB))
//                {
//                    return "SUCCESS AUTHENTIFICATION";////If the user entered values are already present in the database, which means user has already registered so return a SUCCESS message.
//                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Invalid user credentials";
    }
}