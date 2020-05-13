package edu.miu.cs.cs427.blackpanther.controller;

import edu.miu.cs.cs427.blackpanther.model.LoginBeanDTO;
import edu.miu.cs.cs427.blackpanther.service.LoginDAO;


import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("loginUserName");
        String password = request.getParameter("loginpassword");

        LoginBeanDTO loginBeanDTO = new LoginBeanDTO(); //creating object for LoginBean class.

        loginBeanDTO.setUserName(userName); //setting the username and password through the loginBean object then only you can get it in future.
        loginBeanDTO.setPassword(password);

        LoginDAO loginDao = new LoginDAO(); //creating object for LoginDao. This class contains main logic of
        // the
        // application.

        String userValidate = loginDao.authenticate(loginBeanDTO); //Calling authenticateUser function

        if (userValidate.equals("SUCCESS AUTHENTICATION")){
            System.out.println("SSuccessfully logged in.....");
            request.setAttribute("firstNameUser", loginDao); // replaced userName

            System.out.println("Successfully logged in.....");
            request.setAttribute("firstNameUser", userName);
            System.out.println("logged in....." + userName);
            request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
        }
        else
        {
            System.out.println("User Name and password do not exist in db.....");
            request.setAttribute("errMessage", userValidate);//If authenticate() function returns other than SUCCESS string it will be sent to Login page again. Here the error message returned from function has been stored in a errMessage key.
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/login.jsp");
        dispatcher.forward(request,response);
    }
}