package edu.miu.cs.cs427.blackpanther.controller;

import edu.miu.cs.cs427.blackpanther.model.User;
import edu.miu.cs.cs427.blackpanther.service.UserRegistrationService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "UserRegistrationController", urlPatterns = {"/user-registration"})
public class UserRegistrationController extends HttpServlet {

    //Create a new user object
    UserRegistrationService userObj = new UserRegistrationService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Node HIt!!!!!!");
        //Get data from form that is submitted for registration
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Integer age = Integer.parseInt(request.getParameter("age"));
        String email = request.getParameter("email");

        User user = new User(firstName, lastName, userName, password, age, email);
        request.getSession(true).setAttribute("newUser", user);


        try {
            userObj.registerUser(user);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

//        response.sendRedirect("");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
        dispatcher.forward(request,response);
//        if(result){
//            successMessage = "<span style='color:green;'>Successfully Registered.</span><br />";
//            request.setAttribute("successMessage", successMessage);
//            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
//        }
//        else {
//            successMessage = "<span style='color:red;'>Registration Failed.</span><br />";
//            request.getRequestDispatcher("/login").forward(request, response);
//        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/signUpForm.jsp");
        dispatcher.forward(request,response);
    }
}
