package edu.miu.cs.cs427.blackpanther.controller;

import edu.miu.cs.cs427.blackpanther.model.PetDTO;

import edu.miu.cs.cs427.blackpanther.service.PetRegistrationService;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PetRegistrationServlet", urlPatterns = {"/register-pet"})
public class PetRegistrationServlet extends HttpServlet {
    PetRegistrationService petObj = new PetRegistrationService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String successMessage = "";
        String breedType = request.getParameter("breedType");
        String sex = request.getParameter("sexName");
        String color = request.getParameter("colorName");
        String type = request.getParameter("typeName");
        String weight = request.getParameter("weightName");
        String description = request.getParameter("descriptionName");
        String date = request.getParameter("dateName");


        PetDTO petDTO = new PetDTO( breedType, sex, color,type, weight, description, date);


        request.setAttribute("newPet", petDTO);
        int writeResult = petObj.registerPet(petDTO);

        if(writeResult == 1){
            successMessage = "<span style='color:green;'>Pet Successfully Posted.</span><br />";
            request.setAttribute("successMessage", successMessage);
            request.getRequestDispatcher("/WEB-INF/views/registerPet.jsp").forward(request, response);
        }
        else {
            successMessage = "<span style='color:red;'>Registration Failed.</span><br />";
            request.setAttribute("successMessage", successMessage);
            request.getRequestDispatcher("WEB-INF/views/registerPet.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/registerPet.jsp");
        dispatcher.forward(request,response);
    }
}
