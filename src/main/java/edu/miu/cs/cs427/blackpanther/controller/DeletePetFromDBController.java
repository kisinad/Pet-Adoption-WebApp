package edu.miu.cs.cs427.blackpanther.controller;

import edu.miu.cs.cs427.blackpanther.repository.PetsDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "DeletePetFromDBController", urlPatterns = {"/delete"})
public class DeletePetFromDBController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer petID = Integer.parseInt(request.getParameter("petName"));
        PetsDAO petsDAO = new PetsDAO();
        boolean result = petsDAO.deletePetFromDB(petID);

        HttpSession session = request.getSession(true);
        if(result == true){
            session.setAttribute("deleted", "<span style='color:green;'>Deleted Successfully!</span><br />");
        }
        else {
            session.setAttribute("failed", "<span style='color:red;'>Failed to delete!</span><br /> ");
        }
        response.sendRedirect("viewPets");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
