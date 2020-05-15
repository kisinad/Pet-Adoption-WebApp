package edu.miu.cs.cs427.blackpanther.controller;

import edu.miu.cs.cs427.blackpanther.repository.PetsDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewPetsController", urlPatterns = {"/viewPets"})
public class ViewPetsController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PetsDAO petsDAO = new PetsDAO();
        if (request.getSession().getAttribute("deleted") != null) {
            request.setAttribute("deleted", request.getSession().getAttribute("deleted"));
            request.getSession().setAttribute("deleted", "");
        }

        if (request.getSession().getAttribute("failed") != null) {
            request.setAttribute("failed", request.getSession().getAttribute("failed"));
            request.getSession().setAttribute("failed", "");
        }
        request.setAttribute("pets", petsDAO.getAllPets());
        request.getRequestDispatcher("/WEB-INF/views/viewPets.jsp").forward(request, response);
    }
}