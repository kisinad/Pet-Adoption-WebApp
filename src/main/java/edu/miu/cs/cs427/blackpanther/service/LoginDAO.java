package edu.miu.cs.cs427.blackpanther.service;

import edu.miu.cs.cs427.blackpanther.model.LoginBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {//DAO

    public String authenticate(LoginBean loginBean){
        String userName = loginBean.getUserName();
        String password = loginBean.getPassword();

        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String userNameDB = "";
        String passwordDB =  "";

        try {
            con = GetConnection.getConnection(); //Fetch database connection object
            statement = con.createStatement();//Statement is used to write queries.
            resultSet = statement.executeQuery("select userName, password from users");//the table name is users and userName,password are columns. Fetching all the records and storing in a resultSet.

            while (resultSet.next())//Until next row is present otherwise it return false
            {
                userName = resultSet.getString("userName");
                passwordDB = resultSet.getString("password");

                if (userName.equals(userNameDB)&&password.equals(passwordDB))
                {
                    return "SUCCESS AUTHENTIFICATION";////If the user entered values are already present in the database, which means user has already registered so return a SUCCESS message.
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Invalid user credentials";
    }
}
