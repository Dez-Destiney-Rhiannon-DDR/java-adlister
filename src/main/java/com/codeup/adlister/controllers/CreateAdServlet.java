package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;

<<<<<<< HEAD
=======

>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
=======

>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp")
            .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
<<<<<<< HEAD
        Ad ad = new Ad(
            1, // for now we'll hardcode the user id
=======

        Ad ad = new Ad(
            1, // for now we'll hardcode the user id

>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
            request.getParameter("title"),
            request.getParameter("description")
        );
        DaoFactory.getAdsDao().insert(ad);
        response.sendRedirect("/ads");
    }
}
