package edu.miu.cs.cs427.blackpanther.controller;

import edu.miu.cs.cs427.blackpanther.model.PetDTO;
import edu.miu.cs.cs427.blackpanther.service.LoginDAO;
import edu.miu.cs.cs427.blackpanther.service.SearchDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SearchServlet")
public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Here type of Pet / sex are the variables which I have given in the input box in Login.jsp page. Here I am
        // retrieving the values entered by the user and keeping in instance variables for further use.

        String typeInputTemp = request.getParameter("type");
        String sexInputTemp = request.getParameter("sex");
////creating object for LoginBean class, which is a normal java class, contains just setters and getters. Bean classes are efficiently used in java to access user information wherever required in the application.
        PetDTO petDTO = new PetDTO();


        petDTO.setType(typeInputTemp); //setting the type and sex through the loginBean object then only you
        // can
        // get it in future.
        petDTO.setSex(sexInputTemp);

        SearchDAO searchDAO = new SearchDAO(); //creating object for SearchDAO. This class contains main logic of the
        // application.

        String userValidate = searchDAO.doSearch(petDTO); //Calling search function


        request.setAttribute("type", typeInputTemp); //with setAttribute() you can define a "key" and value pair so that you
        // can get it in future using getAttribute("key")
        request.getRequestDispatcher("/Home.jsp").forward(request, response);//RequestDispatcher is used to send the control to the invoked page.

        request.setAttribute("errMessage", userValidate); //If authenticateUser() function returnsother than SUCCESS string it will be sent to Login page again. Here the error message returned from function has been stored in a errMessage key.
        request.getRequestDispatcher("/WEB-INF/views/searchResults.jsp").forward(request, response);//forwarding the request
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
