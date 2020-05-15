package edu.miu.cs.cs427.blackpanther.controller;

import edu.miu.cs.cs427.blackpanther.model.UserDTO;
import edu.miu.cs.cs427.blackpanther.repository.PetsDAO;
import edu.miu.cs.cs427.blackpanther.service.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("loginUserName");
        String password = request.getParameter("loginpassword");

        UserDTO userDTO = new UserDTO(); //creating object for LoginBean class.

        userDTO.setUserName(userName); //setting the username and password through the loginBean object then only you can get it in future.
        userDTO.setPassword(password);

        LoginService loginService = new LoginService(); //creating object for LoginDao. This class contains main logic of

        String userValidate = loginService.authenticate(userDTO); //Calling authenticateUser function

        if (userValidate.equals("SUCCESS AUTHENTICATION")){
            HttpSession session = request.getSession(true);
            System.out.println("Successfully logged in.....");
            session.setAttribute("firstNameUser", userName);
            System.out.println("logged in....." + userName);

            PetsDAO petsDAO = new PetsDAO();
            request.setAttribute("errorMessage", "Invalid user or password");
            session.setAttribute("pets", petsDAO.getAllPets());
//            request.getRequestDispatcher("/WEB-INF/views/viewPets.jsp").forward(request, response);

            response.sendRedirect("viewPets");
            //request.getRequestDispatcher("/WEB-INF/views/viewPets.jsp").forward(request, response);
        }
        else
        {
            System.out.println("User Name and password do not exist in db.....");
            request.setAttribute("errMessage", userValidate);
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

            //ian's

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/login.jsp");
        dispatcher.forward(request,response);
    }
}