package edu.miu.cs.cs427.blackpanther.controller;

import edu.miu.cs.cs427.blackpanther.model.User;
import edu.miu.cs.cs427.blackpanther.service.LoginService;
import edu.miu.cs.cs427.blackpanther.service.UserRegistrationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserRegistrationController", urlPatterns = {"/user-registration"})
public class UserRegistrationController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName, lastName, userName, password, email, successMessage, failedMessage;
        Integer age;

        //Get data from form that is submitted for registration
        firstName = request.getParameter("firstName");
        lastName = request.getParameter("lastName");
        userName = request.getParameter("userName");
        password = request.getParameter("password");
        age = Integer.parseInt(request.getParameter("age"));
        email = request.getParameter("email");

        //Create a new user object
        User user = new User(firstName, lastName, userName, password, age, email);
        request.getSession(true).setAttribute("newUser", user);

        //check if registration is successful or not
        UserRegistrationService loginService = new UserRegistrationService();
        boolean result = loginService.isRegistered(user);

        if(result){
            successMessage = "<span style='color:green;'>Successfully Registered.</span><br />";
            request.setAttribute("successMessage", successMessage);
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }
        else {
            successMessage = "<span style='color:red;'>Registration Failed.</span><br />";
            request.getRequestDispatcher("/login").forward(request, response);
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
