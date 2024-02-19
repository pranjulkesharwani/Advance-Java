package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import javax.servlet.ServletException;

import models.User;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user = new User();
        user.setName("kushal");
        user.setAge(24);

        request.setAttribute("user", user);

        // request.getRequestDispatcher("next1.jsp").forward(request, response);
        request.getRequestDispatcher("next2.jsp").forward(request, response);
    }
}