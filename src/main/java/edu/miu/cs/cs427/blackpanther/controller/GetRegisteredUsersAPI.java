package edu.miu.cs.cs427.blackpanther.controller;

import com.google.gson.Gson;
import edu.miu.cs.cs427.blackpanther.model.UserDTO;
import edu.miu.cs.cs427.blackpanther.service.GetConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "GetRegisteredUsersAPI", urlPatterns = {"/registeredJsonAPI"})
public class GetRegisteredUsersAPI extends HttpServlet {

    private Gson gson = new Gson();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            con = GetConnection.getConnection();
            statement = con.createStatement();
            resultSet = statement.executeQuery("select * from PetWebAppUsers.users ");
//
            while (resultSet.next()) {
                UserDTO user = new UserDTO();
                user.setFirstName(resultSet.getString("userName"));
                user.setFirstName(resultSet.getString("firstName"));
                user.setFirstName(resultSet.getString("lastName"));
                user.setFirstName(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));

                String petJsonString = this.gson.toJson(user);

                PrintWriter out = response.getWriter();
                response.setContentType("application/json");
                response.setCharacterEncoding("UTF-8");
                out.print(petJsonString);
                out.flush();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

