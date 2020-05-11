package edu.miu.cs.cs427.blackpanther.controller;

import edu.miu.cs.cs427.blackpanther.model.LoginBean;
import edu.miu.cs.cs427.blackpanther.service.LoginDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        LoginBean loginBean = new LoginBean(); //creating object for LoginBean class, which is a normal java class, contains just setters and getters. Bean classes are efficiently used in java to access user information wherever required in the application.

        loginBean.setUserName(userName); //setting the username and password through the loginBean object then only you can get it in future.
        loginBean.setPassword(password);

        LoginDAO loginDao = new LoginDAO(); //creating object for LoginDao. This class contains main logic of
        // the
        // application.

        String userValidate = loginDao.authenticate(loginBean); //Calling authenticateUser function

        if (userValidate.equals("SUCCESS")){
            request.setAttribute("userName", userName);
            request.getRequestDispatcher("/??").forward(request, response);
        }
        else
        {
            request.setAttribute("errMessage", userValidate);//If authenticate() function returnsother than SUCCESS string it will be sent to Login page again. Here the error message returned from function has been stored in a errMessage key.
            request.getRequestDispatcher("/login").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userID, password;
    }
}
