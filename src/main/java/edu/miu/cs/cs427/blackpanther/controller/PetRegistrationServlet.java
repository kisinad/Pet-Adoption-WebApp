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
        System.out.println("Pet Registration hit....");

        String successMessage = "";
<<<<<<< HEAD
        Integer animalId = Integer.parseInt("1");
//        Integer animialId = Integer.parseInt(request.getParameter("animalName"));
        String type = request.getParameter("breedType");
//        String breed = request.getParameter("breedName");
=======

        Integer animialId = Integer.parseInt(request.getParameter("animalName"));
        String type = request.getParameter("breedName");
        String breed = request.getParameter("breedName");
>>>>>>> f84e3907b27dab553c3e7c0dd74e02e8c776eab9
        String sex = request.getParameter("sexName");
        String color = request.getParameter("colorName");
        String weight = request.getParameter("weightName");
        String description = request.getParameter("descriptionName");
        String date = request.getParameter("dateName");

<<<<<<< HEAD
        PetDTO petDTO = new PetDTO(animalId, type, sex, color, weight, description, date);
=======

        PetDTO petDTO = new PetDTO(animialId, type, breed, sex, color, weight, description, date);
>>>>>>> f84e3907b27dab553c3e7c0dd74e02e8c776eab9

        request.getSession(true).setAttribute("newPet", petDTO);
        int writeResult = petObj.registerPet(petDTO);

        if(writeResult == 1){
            successMessage = "<span style='color:green;'>Pet Successfully Posted.</span><br />";
            request.setAttribute("successMessage", successMessage);
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }
        else {
            successMessage = "<span style='color:red;'>Registration Failed.</span><br />";
            request.getRequestDispatcher("WEB-INF/views/signUpForm.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/registerPet.jsp");
        dispatcher.forward(request,response);
    }
}
