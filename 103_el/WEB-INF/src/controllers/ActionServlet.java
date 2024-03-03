package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import models.User;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        User user = new User();

        user.setName("Rahul");
        user.setAge(30);
        user.setUserInfo("working");

        request.setAttribute("user", user);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}