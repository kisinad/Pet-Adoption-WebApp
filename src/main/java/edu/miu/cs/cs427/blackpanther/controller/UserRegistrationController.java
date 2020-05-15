package edu.miu.cs.cs427.blackpanther.controller;

import edu.miu.cs.cs427.blackpanther.model.UserDTO;
import edu.miu.cs.cs427.blackpanther.service.UserRegistrationService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserRegistrationController", urlPatterns = {"/user-registration"})
public class UserRegistrationController extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    //Create a new user object
    UserRegistrationService userObj = new UserRegistrationService();
//    User user = new User();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Node HIt!!!!!!");
        //Get data from form that is submitted for registration
        String missingFieldsMsg = "";
        String successMessage = "";
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        String email = request.getParameter("email");

        UserDTO userDTO = new UserDTO(firstName, lastName, userName, password, email);
//        request.getSession(true).setAttribute("newUser", userDTO); //removed .getFirstName()


        //Ian's code
        List<String> errors = new ArrayList<String>();
        if (firstName != null && firstName.equals("")) {
            missingFieldsMsg += "<span style='color:red;'>Your First Name is required!</span><br />";
        }
        if (lastName != null && lastName.equals("")) {
            missingFieldsMsg += "<span style='color:red;'>Your Last Name is required!</span><br />";
            errors.add("Please add a last name");
        }
        if (userName != null && userName.equals("")) {
            missingFieldsMsg += "<span style='color:red;'>Your userName is required!</span><br />";
            errors.add("Please select userName");
        }
        if (email != null && email.equals("")) {
            missingFieldsMsg += "<span style='color:red;'>Your email is required!</span><br />";
            errors.add("Please add a message");
        }
        if (password != null && password.equals("")) {
            missingFieldsMsg += "<span style='color:red;'>Your password is required!</span><br />";
            errors.add("Please select a password");
        }
        if (missingFieldsMsg != "") {

            System.out.println("errors ......" + missingFieldsMsg);
            request.setAttribute("errors", missingFieldsMsg);


        } else {
            UserRegistrationService userRegistrationService = new UserRegistrationService();
            userRegistrationService.registerUser(userDTO);
            successMessage = "<p style='color:green;text-align:center;'>Successfully Registered. "+ userDTO.getFirstName() + "</p><br />";
            request.setAttribute("success", successMessage);
        }
        request.getRequestDispatcher("/WEB-INF/views/signUpForm.jsp").forward(request, response);

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/signUpForm.jsp");
        dispatcher.forward(request,response);
    }
}
